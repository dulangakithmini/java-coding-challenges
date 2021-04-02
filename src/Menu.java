import java.util.List;
import java.util.Scanner;

public class Menu {
    private String message;
    private List<String> choiceList;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setChoiceList(List<String> choiceList) {
        this.choiceList = choiceList;
    }

    public int showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.message);

        for (int i = 0; i < choiceList.size(); i++) {
            System.out.println("Press " + (i + 1) + " to " + choiceList.get(i));
        }

        int choice = scanner.nextInt();

        return choice;

    }
}
