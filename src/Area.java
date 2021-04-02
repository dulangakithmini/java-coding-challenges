public class Area {
    private double radius;

    public Area(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return (Math.PI * radius * radius);
    }
}
