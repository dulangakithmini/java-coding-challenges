import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area calculator.");

        List<String> choiceList = new ArrayList<>();
        choiceList.add("calculate area");
        choiceList.add("quit");

        Menu menu = new Menu("Enter a choice: ", choiceList);

        while (true) {
            switch (menu.showMenu()) {
                case 0:
                    calculateArea();
                    break;
                case 1:
                    return;
                default:
                    break;
            }
        }
    }

    public static void calculateArea() {
        Shape selectedShape = getShapeInput();
        selectedShape.getDimensionInput();
        double area = selectedShape.calculateArea();
        System.out.println("Area is " + area);
    }

    public static Shape getShapeInput() {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());

        List<String> choiceList = new ArrayList<>();
        shapeList.forEach((shape) -> choiceList.add(shape.getName()));

        Menu menu = new Menu("Select a shape", choiceList);
        int shapeIndex = menu.showMenu();
        return shapeList.get(shapeIndex);
    }
}