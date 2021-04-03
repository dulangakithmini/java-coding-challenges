import java.util.Scanner;

public class Circle extends Shape {

    Scanner scanner = new Scanner(System.in);
    private double radius;

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void getDimensionInput() {

        while (true) {
            System.out.print("Enter the radius: ");

            try {
                this.radius = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number!\n");
            }
        }

    }
}