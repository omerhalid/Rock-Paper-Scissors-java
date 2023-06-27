import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        Random rand = new Random();
        int computerChoice = rand.nextInt(1, 4);
        System.out.println(computerChoice);

        Game game1 = new Game(userInput, computerChoice);

        System.out.println("You chose " + game1.getTypeItem());
        System.out.println("Computer chose " + game1.getComputerTypeItem());
        System.out.println("-----------------------");

        String result = game1.gameLogic();
        System.out.println(result);

    }
}
