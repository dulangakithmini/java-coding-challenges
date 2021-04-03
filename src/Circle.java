import java.util.Scanner;

public class Circle extends Shape {

    Scanner scanner = new Scanner(System.in);
    private double radius;

    public Circle() {
        System.out.print("Enter the radius: ");

        try {
            this.radius = scanner.nextDouble();
            System.out.println("Area of the circle= " + calculateArea());
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Enter a valid number!");
            System.out.println("");
        }
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
}