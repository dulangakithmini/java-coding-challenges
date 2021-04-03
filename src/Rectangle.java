import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner scanner = new Scanner(System.in);

    private double height;
    private double width;

    public Rectangle() {
        System.out.print("Enter the height: ");
        try {
            height = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter a valid number!");
            System.out.println("");
        }

        System.out.print("Enter the width: ");
        try {
            width = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter a valid number!");
            System.out.println("");
        }

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Area of the rectangle= " + rectangle.calculateArea());
        System.out.println("");
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (this.height * this.width);
    }

}