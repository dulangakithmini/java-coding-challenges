import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Area calculator.");

        Menu menu = new Menu();
        menu.setMessage("Enter a choice");

        List<String> choiceList = new ArrayList<String>();
        choiceList.add("calculate area");
        choiceList.add("quit");
        menu.setChoiceList(choiceList);

        while (true) {
            switch (menu.showMenu()) {
                case 1:
                    System.out.print("Enter the radius: ");

                    try {
                        double radius = scanner.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.println("Area = " + circle.calculateArea());
                        System.out.println("");
                        break;
                    } catch (Exception e) {
                        System.out.println("Enter a valid number!");
                        System.out.println("");
                    }

                default:
                    break;
            }
        }
    }
}