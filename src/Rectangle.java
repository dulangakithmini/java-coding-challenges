import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner scanner = new Scanner(System.in);
    private double height;
    private double width;

    @Override
    public double calculateArea() {
        return (height * width);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void getDimensionInput() {
        while (true) {
            System.out.print("Enter the height: ");

            try {
                this.height = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Enter a valid number!\n");
            }

            System.out.print("Enter the width: ");

            try {
                this.width = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number!\n");
            }
        }
    }
}