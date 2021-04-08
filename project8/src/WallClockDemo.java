import java.util.Scanner;

public class WallClockDemo {
    public static void main(String args[]) {
        // New scanner in for user input
        Scanner keyboard = new Scanner(System.in);
        // Instantiate new a new WallClock instance.
        WallClock wallclock = new WallClock();
        String decision = "";
        // While the user hasn't entered no for continuing on, enter the while loop.
        while (!decision.equalsIgnoreCase("no")) {
            // Display the current time to the user
            System.out.println("The current time is: " + wallclock.getTime());
            // If the current time doesn't equal zero hundred hours, ask the user if they would like to reset the time.
            if (!wallclock.getTime().equals("00:00:00")) {
                System.out.print("Would you like to reset time back to zero hundred hours? (Enter yes or no): ");
                String resetDecision = keyboard.nextLine();
                if (resetDecision.equalsIgnoreCase("yes")) {
                    wallclock.reset();
                    System.out.println("The current time is: " + wallclock.getTime());
                }
            }
            // Get the users input for how much they would like to advance time by.
            System.out.print("Please enter a number of seconds to advance time by: ");
            wallclock.forward(Integer.parseInt(keyboard.nextLine()));
            // Print the current time after advancing to show accuracy.
            System.out.println("The current time is: " + wallclock.getTime());
            // Get the users input for how much they would like to advance time by.
            System.out.print("Please enter a number of seconds to move back time by: ");
            wallclock.reverse(Integer.parseInt(keyboard.nextLine()));
            // Print the current time after rolling back to show accuracy.
            System.out.println("The current time is: " + wallclock.getTime());
            // Ask the user if they would like to make any further changes to the time, or if they would like to exit.
            System.out.print("Would you like to continue? (Enter yes or no): ");
            decision = keyboard.nextLine();
        }
    }
}
