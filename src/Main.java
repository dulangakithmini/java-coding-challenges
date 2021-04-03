import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Area calculator.");

        String message = "Enter a choice: ";

        List<String> choiceList = new ArrayList<String>();
        choiceList.add("calculate area");
        choiceList.add("quit");

        Menu menu = new Menu(message, choiceList);

        List<String> shapeList = new ArrayList<String>();
        shapeList.add("calculate area of a circle");
        shapeList.add("calculate area of a rectangle");
        shapeList.add("quit");
        Shape shape = new Shape(message, shapeList);

        while (true) {
            switch (menu.showMenu()) {
                case 1:
                    switch (shape.showShapes()) {
                        case 1:
                            Circle circle = new Circle();
                            break;

                        case 2:
                            Rectangle rectangle = new Rectangle();
                            break;

                        default:
                            break;
                    }
                default:
                    break;
            }
        }
    }
}