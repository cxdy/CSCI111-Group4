import java.util.Scanner;

public class WallClockDemo {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        WallClock wallclock = new WallClock();
        String decision = "";
        while (!decision.equalsIgnoreCase("no")) {
            System.out.println("The current time is: " + wallclock.getTime());
            if (!wallclock.getTime().equals("00:00:00")) {
                System.out.print("Would you like to reset time back to zero hundred hours? (Enter yes or no): ");
                String resetDecision = keyboard.nextLine();
                if (resetDecision.equalsIgnoreCase("yes")) {
                    wallclock.reset();
                    System.out.println("The current time is: " + wallclock.getTime());
                }
            }
            System.out.print("Please enter a number of seconds to advance time by: ");
            wallclock.forward(Integer.parseInt(keyboard.nextLine()));
            System.out.println("The current time is: " + wallclock.getTime());
            System.out.print("Please enter a number of seconds to move back time by: ");
            wallclock.reverse(Integer.parseInt(keyboard.nextLine()));
            System.out.println("The current time is: " + wallclock.getTime());
            System.out.print("Would you like to continue? (Enter yes or no): ");
            decision = keyboard.nextLine();
        }
    }
}
