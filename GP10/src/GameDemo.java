import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameFunctions game = new GameFunctions();
        char choice;
        do {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = sc.nextLine().trim();
            while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                userChoice = sc.nextLine().trim();
            }
            game.choose();
            String result = game.whoWon(userChoice);
            String final_result = "";
            if (result.equalsIgnoreCase("user"))
                final_result = "You win!";
            else if (result.equalsIgnoreCase("computer"))
                final_result = "You lose!";
            else
                final_result = "It's a tie!";
            System.out.println(final_result);
            System.out.print("\nWould you like to play again? (Y for yes): ");
            choice = sc.nextLine().trim().charAt(0);
            if (choice == 'N' || choice == 'n') {
                break;
            }
            System.out.println();
        }while(choice != 'N' || choice != 'n');
    }
}