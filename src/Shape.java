import java.util.List;
import java.util.Scanner;

public class Shape {

    private String message;
    private List<String> shapeList;

    public Shape() {

    }

    public Shape(String message, List<String> shapeList) {
        this.message = message;
        this.shapeList = shapeList;
    }

    public int showShapes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.message);

        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println("Press " + (i + 1) + " to " + shapeList.get(i));
        }

        int choice = scanner.nextInt();

        return choice;
    }

    public double calculateArea() {
        switch (showShapes()) {
            case 1:
                Circle circle = new Circle();
                break;

            case 2:
                Rectangle rectangle = new Rectangle();
                break;

            default:
                break;
        }

        return -1;
    }
}