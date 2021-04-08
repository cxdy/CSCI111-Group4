import java.util.Scanner;

public class WallClockDemo2 {

    public static void main(String[] args) {
        // init clock
        WallClock newClock = new WallClock();

        // init scanner
        Scanner input = new Scanner(System.in);

        // startup info
        System.out.println("WallClock Demo");
        System.out.println("Syntax: command [seconds]");
        System.out.println("Available commands: forward, reverse, reset, getTime (no args), exit (no args)");

        // keep prompt looping
        while(true){
            // prompt
            System.out.print("TIME> ");
            // get user input
            String userInput = input.nextLine();
            // split command and args into array using regular expression
            String[] command = userInput.split("\\s+");

            // grab the command
            String enteredCommand = command[0];
            // initialize enteredSeconds
            int enteredSeconds;
            // Check to see if the user has inputted seconds and account for no seconds entered if not.
            if (command.length == 1) {
                enteredSeconds = 0;
            } else {
                enteredSeconds = Integer.parseInt(command[1]);
            }

            // switch for each command
            switch(enteredCommand){
                // gets the time from the getTime() method
                case "getTime":
                    System.out.println("The time is: " + newClock.getTime());
                    break;
                // forward [seconds] and returns the time
                case "forward":
                    newClock.forward(enteredSeconds);
                    System.out.println("The new time is: " + newClock.getTime());
                    break;
                // reverse [seconds] and returns the time
                case "reverse":
                    newClock.reverse(enteredSeconds);
                    System.out.println("The new time is: " + newClock.getTime());
                    break;
                // reset and returns time
                case "reset":
                    newClock.reset();
                    System.out.println("The time has been reset to: " + newClock.getTime());
                    break;
                // exits program
                case "exit":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                // any other input
                default:
                    System.out.println("That was not a valid command");
                    System.out.println("Syntax: command [seconds]");
                    System.out.println("Available commands: forward, reverse, reset, getTime (no args), exit (no args)");
                    break;
            }

        }

    }

}
