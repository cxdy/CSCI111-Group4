import java.util.Scanner;

public class ComboLockDemo {

    public static void main(String[] args) {

        // Init scanner for keyboard input.
        Scanner input = new Scanner(System.in);

        // Set combination by constructing new ComboLock object.
        ComboLock Combo = new ComboLock(26, 12, 33);

        // Vars to store each turn.
        int turn1;
        int turn2;
        int turn3;

        // Loop for endless retries.
        while (true) {
            // Grab input for first turn.
            System.out.print("Enter turn #1: ");
            turn1 = input.nextInt();
            // Call function turnCounterClockwise.
            Combo.turnCounterClockwise(turn1);
            // Second turn.
            System.out.print("Enter turn #2: ");
            turn2 = input.nextInt();
            // This time go clockwise.
            Combo.turnClockwise(turn2);
            System.out.print("Enter turn #3: ");
            turn3 = input.nextInt();
            Combo.turnCounterClockwise(turn3);
            // Attempt to open, true means unlocked.
            System.out.println(Combo.open());
            // Reset the previous attempts.
            Combo.reset();
        }
    }
}