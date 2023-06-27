import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Welcome to Rock, Paper, Scissors Game!");
            System.out.println("Please choose an option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");

            int userInput = scanner.nextInt();

            if (userInput == 4) {
                System.out.println("Exiting Game. Thanks for playing!");
                break;
            }

        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}
