import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner scanner = new Scanner(System.in);

    private double height;
    private double width;

    public Rectangle() {
        System.out.print("Enter the height: ");
        try {
            this.height = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter a valid number!");
            System.out.println("");
        }

        System.out.print("Enter the width: ");
        try {
            this.width = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter a valid number!");
            System.out.println("");
        }

        System.out.println("Area of the rectangle= " + calculateArea());
        System.out.println("");
    }

    @Override
    public double calculateArea() {
        return (this.height * this.width);
    }

}