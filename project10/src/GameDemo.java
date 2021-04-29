import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        // Instantiate a new Scanner for keyboard input and a new GameFunctions object.
        Scanner keyboard = new Scanner(System.in);
        GameFunctions newGame = new GameFunctions();
        // Create a boolean for use in a while loop.
        boolean keepGoing = true;
        while(keepGoing) {
            // Prompt the user to enter their choice and ingest it with the Scanner object.
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = keyboard.nextLine().toLowerCase();
            // If the user input equals either rock, paper, or scissors, proceed with the game
            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                // Call the choose method and whoWon method
                newGame.choose();
                GameFunctions.whoWon(userChoice);
                // Prompt the user to decide if they would like to play again. Acceptable yes inputs: Y or y.
                System.out.print("Would you like to play again? (Y for yes): ");
                userChoice = keyboard.nextLine();
                // If the user choice is anything other than Y or y, end the program.
                if (!userChoice.equalsIgnoreCase("Y")) {
                    keepGoing = false;
                }
            }
            // If the user input doesn't equal rock, paper, or scissors, display the error and restart the while loop.
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
