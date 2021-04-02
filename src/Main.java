import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Area calculator");

        Menu menu = new Menu();

        switch (menu.menu()) {
            case 1:
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                Area area = new Area(radius);
                System.out.println("Area = " + area.calculateArea(radius));
                break;

            default:
                break;
        }

    }
}
