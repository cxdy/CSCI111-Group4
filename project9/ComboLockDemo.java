package csci111.group4;

import java.util.Scanner;

public class ComboLockDemo {

    public static void main(String[] args) {

        // init scanner for keyboard input
        Scanner input = new Scanner(System.in);

        // set combo by constructing new combolock object
        ComboLock Combo = new ComboLock(26, 12, 33);

        // vars to store each turn
        int turn1;
        int turn2;
        int turn3;

        // loop for endless retries
        while (true) {
            // grab input for first turn
            System.out.print("Enter turn #1: ");
            turn1 = input.nextInt();
            // call function turnCounterClockwise
            Combo.turnCounterClockwise(turn1);
            // second turn
            System.out.print("Enter turn #2: ");
            turn2 = input.nextInt();
            // this time go clockwise
            Combo.turnClockwise(turn2);
            System.out.print("Enter turn #3: ");
            turn3 = input.nextInt();
            Combo.turnCounterClockwise(turn3);

            // attempt to open, true means unlocked
            System.out.println(Combo.open());
            // reset the attempt
            Combo.reset();

        }

    }

}

