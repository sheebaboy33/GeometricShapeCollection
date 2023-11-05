public class Circle extends GeometricObject{

    protected double radius;

    public Circle() {
        this.radius = 7;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle{ " + super.toString() +
                "radius=" + radius +
                '}';
    }
}
