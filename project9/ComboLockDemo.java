package csci111.group4;

import java.util.Scanner;

public class ComboLockDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ComboLock Combo = new ComboLock(20, 10, 15);

        int[] turns = {0, 0, 0};
        int[] attempt = {0, 1, 2};

        while (true) {
            System.out.print("Enter turn #1: ");
            turns[0] = input.nextInt();
            attempt[0] = Combo.turnClockwise(turns[0], 0);
            System.out.print("Enter turn #2: ");
            turns[1] = input.nextInt();
            attempt[1] = Combo.turnCounterClockwise(turns[1], 1);
            System.out.print("Enter turn #3: ");
            turns[2] = input.nextInt();
            attempt[2] = Combo.turnClockwise(turns[2], 2);

            Combo.attempt = turns;
            boolean openStatus = Combo.open();

            String[] attemptStr = {Integer.toString(attempt[0]), Integer.toString(attempt[1]), Integer.toString(attempt[2])};

            if (openStatus) {
                System.out.println("Unlocked!");
                break;
            } else {
                System.out.println("Still locked.");
                Combo.reset();
            }
        }
    }
}
