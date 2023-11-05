import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;
    private int numObjects;

    Scanner input = new Scanner(System.in);

    public GeometricShapeCollection(int listLength) {
        this.numObjects = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }


    @Override
    public void addShape(GeometricObject shape) {
        // check if there are spaces and add the shape to the list
        if (shapeList.size() < numObjects){
            shapeList.add(shape);
        }
        else{
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for(int i=0; i < shapeList.size(); i++){
            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Shape = Circle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        System.out.print(">>>");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");

                int choice2 = input.nextInt();
                input.nextLine();

                System.out.println("Enter the color of your shape");
                String colour = input.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = input.nextLine();
                boolean filled = false;

                if (isFilled.equals("y")) {
                    filled = true;
                } else if (isFilled.equals("n")) {
                    filled = false;
                } else {
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");
                }

                switch (choice2) {
                    case 1 -> {
                        // it is a circle
                        System.out.print("Insert the radius");
                        double radius = input.nextDouble();
                        Circle c = new Circle(radius, colour, filled);
                        this.addShape(c);
                        break;
                    }
                    case 2 -> {
                        // it is a rectangle
                        System.out.print("Insert length: ");
                        double length = input.nextDouble();
                        System.out.print("Insert width: ");
                        double width = input.nextDouble();
                        Rectangle r = new Rectangle(length, width);
                        this.addShape(r);
                        break;
                    }
                    case 3 -> {
                        // it is a square
                        System.out.print("Insert size of a side: ");
                        double size = input.nextDouble();
                        Square sq = new Square(size);
                        this.addShape(sq);
                        break;
                    }
                }
                break;

            case 2:
                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;

        }
        return exit;
    }
}
