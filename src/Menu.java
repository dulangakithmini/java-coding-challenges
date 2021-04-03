import java.util.List;
import java.util.Scanner;

public class Menu {
    private String message;
    private List<String> choiceList;

    public Menu(String message, List<String> choiceList) {
        this.message = message;
        this.choiceList = choiceList;
    }

    public int showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.message);

        for (int i = 0; i < choiceList.size(); i++) {
            System.out.println("Press " + (i + 1) + " to " + choiceList.get(i));
        }

        while (true) {
            try {
                int choice = scanner.nextInt() - 1;
                if (choice >= 0 && choice < choiceList.size()) {
                    return choice;
                } else {
                    throw new Exception("Enter a valid choice!");
                }

            } catch (Exception e) {
                System.out.println("Enter a valid choice!\n");
            }
        }

    }
}
