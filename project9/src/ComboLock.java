public class ComboLock {
    // The following three integers are the combination to the lock
    private final int counterClockwise1Key;
    private final int clockwiseKey;
    private final int counterClockwise2Key;
    // The following three integer are the users input for the lock
    private int counterClockwise1Input;
    private int clockwiseInput;
    private int counterClockwise2Input;
    // The current dial reading of the combination lock
    private int currentDialReading = 0;
    // The current number indicating the progress so far in the combination process, such as turn 1, 2, or 3.
    private int turn = 0;

    public ComboLock(int left1, int right, int left2) {
        // The following three statements make use of double inline statements; each of which set the user input
        // to zero if if the input is below zero and to 39 if the input is above 39.
        counterClockwise1Key = left1 < 39 & left1 > 0 ? left1 : left1 < 0 ? 0 : 39;
        clockwiseKey = right < 39 & right > 0 ? right : right < 0 ? 0 : 39;
        counterClockwise2Key = left2 < 39 & left2 > 0 ? left2 : left2 < 0 ? 0 : 39;
    }

    // Reset all clock inputs and the current dial reading back to zero, this forgetting al previous inputs.
    public void reset() {
        counterClockwise1Input = 0;
        clockwiseInput = 0;
        counterClockwise2Input = 0;
        currentDialReading = 0;
        turn = 0;
    }

    public void turnClockwise(int clockwiseAmount) {
        // Take the absolute value of the current dial reading minus modulo 40 of the input from the user (which will
        // eliminate values above 39), then set the result as the new current dial reading.
        currentDialReading = Math.abs(currentDialReading - (clockwiseAmount % 40));
        // Set the clockwise input to the calculation found above.
        clockwiseInput = currentDialReading;
        // Iterate the turn.
        turn++;
    }

    public void turnCounterClockwise(int counterClockwiseAmount) {
        // Take the absolute value of the current dial reading minus the input from the user,
        // then take the modulo 40 of that (which will eliminate values above 39), then set it as the
        // new current dial reading.
        currentDialReading = (currentDialReading + counterClockwiseAmount) % 40;
        // Determine which turn the user is at and use it to set the input to the correct input value.
        if (turn == 0) {
            counterClockwise1Input = currentDialReading;
        }
        else {
            counterClockwise2Input = currentDialReading;
        }
        // Iterate the turn.
        turn ++;
    }

    public boolean open() {
        // Return a boolean indicating whether or not the user inputs matches the combination.
        return counterClockwise1Input == counterClockwise1Key &
                clockwiseInput == clockwiseKey &
                counterClockwise2Input == counterClockwise2Key;
    }
}
