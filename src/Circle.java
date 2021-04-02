public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return (Math.PI * radius * radius);

    }
}
