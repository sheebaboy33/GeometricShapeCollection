public class Square extends GeometricObject{
    protected double side;

    public Square() {
        this.side = 4;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getShape() {
        return null;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Square{ " + super.toString() +
                "side=" + side +
                '}';
    }
}
