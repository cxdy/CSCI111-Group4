import java.util.Scanner;

class StateDemo {
    public static void main(String[] args) {
        // Instantiate three state objects
        State state1 = new State();
        State state2 = new State();
        State state3 = new State();

        // Instantiate a new scanner object to read in user inputs
        Scanner keyboard = new Scanner(System.in);

        // Below three code blocks each collect state name and population from the user.
        System.out.print("Please enter the the first state: ");
        state1.stateName = keyboard.nextLine();
        System.out.print("Please enter the first state\'s population: ");
        state1.population = Integer.parseInt(keyboard.nextLine());

        System.out.print("Please enter the the second state: ");
        state2.stateName = keyboard.nextLine();
        System.out.print("Please enter the second state\'s population: ");
        state2.population = Integer.parseInt(keyboard.nextLine());

        System.out.print("Please enter the the third state: ");
        state3.stateName = keyboard.nextLine();
        System.out.print("Please enter the third state\'s population: ");
        state3.population = Integer.parseInt(keyboard.nextLine());

        // Print out the state name and population for each state in a formatted string.
        System.out.println(state1.formattedOutput());
        System.out.println(state2.formattedOutput());
        System.out.println(state3.formattedOutput());
    }
}
