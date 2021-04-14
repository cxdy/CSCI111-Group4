public class ComboLock {
    private final int counterClockwise1Key;
    private final int clockwiseKey;
    private final int counterClockwise2Key;
    private int counterClockwise1Input;
    private int clockwiseInput;
    private int counterClockwise2Input;
    private int currentDialReading = 0;
    private int progress = 0;

    public ComboLock(int left1, int right, int left2) {
        counterClockwise1Key = left1 < 39 & left1 > 0 ? left1 : left1 < 0 ? 0 : 39;
        clockwiseKey = right < 39 & right > 0 ? right : right < 0 ? 0 : 39;
        counterClockwise2Key = left2 < 39 & left2 > 0 ? left2 : left2 < 0 ? 0 : 39;
    }

    public void reset() {
        counterClockwise1Input = 0;
        clockwiseInput = 0;
        counterClockwise2Input = 0;
        currentDialReading = 0;
    }

    public void turnClockwise(int clockwiseAmount) {
        currentDialReading = Math.abs(currentDialReading - (clockwiseAmount % 40));
        clockwiseInput = currentDialReading;
        progress++;
    }

    public void turnCounterClockwise(int counterClockwiseAmount) {
        currentDialReading = (currentDialReading + counterClockwiseAmount) % 40;
        if (progress == 0) {
            counterClockwise1Input = currentDialReading;
        }
        else {
            counterClockwise2Input = currentDialReading;
        }
        progress ++;
    }

    public boolean open() {
        return counterClockwise1Input == counterClockwise1Key &
                clockwiseInput == clockwiseKey &
                counterClockwise2Input == counterClockwise2Key;
    }
}
