import java.util.Scanner;

public class Menu {

    public int showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("Press 1 to calculate area");
        System.out.println("Press 2 to exit");
        int choice = scanner.nextInt();

        return choice;

    }
}
