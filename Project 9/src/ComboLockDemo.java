public class ComboLockDemo {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(26, 12, 33);
        comboLock.turnCounterClockwise(26);
        comboLock.turnClockwise(14);
        comboLock.turnCounterClockwise(21);
        System.out.println(if comboLock.open("Open"));

        ComboLock comboLock1 = new ComboLock(450, -500, 20);
        comboLock1.turnCounterClockwise(39);
        comboLock1.turnClockwise(39);
        comboLock1.turnCounterClockwise(20);
        System.out.println(if comboLock.open("Open"));
    }
}
