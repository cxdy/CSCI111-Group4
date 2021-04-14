public class ComboLock {
    //private fields to build comboLock calculations
    private final int code1;
    private final int code2;
    private final int code3;
    private int code1Input;
    private int code2Input;
    private int code3Input;
    private int showDial = 0;


    //Public constructor setting parameter limits of the input between 0 and 39 for each of the three inputs.
    public ComboLock(int left1, int right, int left2) {
        code1 = left1 < 39 & left1 > 0 ? left1 : left1 < 0 ? 0 : 39;
        code2 = right < 39 & right > 0 ? right : right < 0 ? 0 : 39;
        code3 = left2 < 39 & left2 > 0 ? left2 : left2 < 0 ? 0 : 39;
    }
    //reset method that reverts all combo inputs to 0
    public void reset() {
        code1Input = 0;
        code2Input = 0;
        code3Input = 0;
        showDial = 0;
    }
    //a method that uses an integer input to move the dial "clockwise" or forward the desired amount input by the user.
    public void turnClockwise(int clockwiseAmount) {
        showDial = Math.abs(showDial - (clockwiseAmount % 40));
        code2Input = showDial;

    }
    //a method that uses an integer input to move the dial "counter clockwise" or backward the desired amount input by the user.
    public void turnCounterClockwise(int counterClockwiseAmount) {
        showDial = (showDial + counterClockwiseAmount) % 40;
        if (code2Input == 0) { code1Input = showDial; }
        else { code3Input = showDial; }

    }

    //method to open lock if correct inputs are given the lock will return true, if incorrect inputs are given, a false output appears.
    public boolean open() {
        return code1Input == code1 &
                code2Input == code2 &
                code3Input == code3;
    }
}