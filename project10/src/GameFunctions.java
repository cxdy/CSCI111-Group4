import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameFunctions {
    private Random generator;
    private static String computerChoice;

    public GameFunctions() {
        // Initialize generator and computerChoice with each objects respective empty constructor.
        generator = new Random();
        computerChoice = new String();
    }

    public void choose() {
        // Get the computer choice that will return 0 to 2, add 1 to get 1 to 3.
        int intComputerChoice = generator.nextInt(3) + 1;
        // Create an array of rock, paper, scissors.
        String[] choiceArray = {"rock", "paper", "scissors"};
        // Find the corresponding string choice in the array with the int from generator.nextInt()
        computerChoice = choiceArray[intComputerChoice-1];
        System.out.printf("The computer chose %s.%n", computerChoice);
    }

    public static void whoWon(String userChoice) {
        // Create a multi-dimensional array that defines the rules when user int choice goes into the first array and
        // the computer int choice goes into the second (i.e rulesArray[userInput][computerInput])
        String[][] rulesArray = {
                {"It's a tie!", "You lose!", "You win!"},
                {"You win!", "It's a tie!", "You lose!"},
                {"You lose!", "You win!", "It's a tie!"}
        };
        // Create an ArrayList and initialize it with rock, paper, and scissors.
        ArrayList<String> choiceArray = new ArrayList<>(List.of("rock", "paper", "scissors"));
        // Use the ArrayList indexOf method to get an integer representation of both the user and computer choice.
        int intUserChoice = choiceArray.indexOf(userChoice);
        int intComputerChoice = choiceArray.indexOf(computerChoice);
        // Print the winner or if it's a tie.
        System.out.println(rulesArray[intUserChoice][intComputerChoice]);
    }
}
