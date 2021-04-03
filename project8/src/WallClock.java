public class WallClock {
    private int hours;
    private int minutes;
    private int seconds;

    public WallClock() {
        reset();
    }

    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public void forward(int secondsForward) {
        computeNewTime(secondsForward);
    }

    public void reverse(int secondsBack) {
        computeNewTime(-secondsBack);
    }

    public String getTime() {
        // For the three inline if statement, see whether a 0 is needed in front of either hours, minutes, or seconds.
        String stringHours = hours < 10 ? "0" + hours : Integer.toString(hours);
        String stringMinutes = minutes < 10 ? "0" + minutes : Integer.toString(minutes);
        String stringSeconds = seconds < 10 ? "0" + seconds : Integer.toString(seconds);
        return stringHours + ":" + stringMinutes + ":" + stringSeconds;
    }

    private void computeNewTime(int deltaSeconds) {
        // Get the current time summed in seconds.
        int cumulativeSecondTime = (hours * 3600) + (minutes * 60) + seconds;
        int newCumulativeSecondTime;
        // If the seconds in the parameter added to the cumulative time is greater than 24 hours (converted to seconds),
        // then spill over into a new day.
        if (deltaSeconds + cumulativeSecondTime > 86400) {
            newCumulativeSecondTime = deltaSeconds + cumulativeSecondTime - 86400;
        }
        else {
            newCumulativeSecondTime = deltaSeconds + cumulativeSecondTime;
        }
        // Get the hours rounded down to the nearest int.
        hours = newCumulativeSecondTime / 3600;
        // Get the remaining minutes from calculating the remainder when dividing out hours.
        int remainingMinutes = newCumulativeSecondTime % 3600;
        // Get the minutes rounded down to the nearest int.
        minutes = remainingMinutes / 60;
        // Get the remaining seconds by calculating the remainder of the remaining minutes by/modulo 60.
        int remainingSeconds = remainingMinutes % 60;
        seconds = remainingSeconds;
    }
}
