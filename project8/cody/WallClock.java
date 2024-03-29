package Project8;

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
        // then spill over into a new day by getting the remainder after dividing out one day in seconds.
        if (deltaSeconds + cumulativeSecondTime > 86400) {
            newCumulativeSecondTime = (deltaSeconds + cumulativeSecondTime) % 86400;
        }
        // If the sum of seconds in the parameter and cumulative time equals a negative value, get the
        // negative remainder after dividing out days (in case the user enters a value greater than one day in seconds)
        // and add it to the value equal to one day in seconds in order to get the final new cumulative seconds value.
        else if (deltaSeconds + cumulativeSecondTime < 0) {
            newCumulativeSecondTime = (deltaSeconds + cumulativeSecondTime) % 86400 + 86400;
        }
        else {
            newCumulativeSecondTime = deltaSeconds + cumulativeSecondTime;
        }
        // Get the hours rounded down to the nearest int.
        hours = newCumulativeSecondTime / 3600;

        if (hours >= 24) { hours = 0; }

        // Get the remaining minutes from calculating the remainder when dividing out hours.
        int remainingMinutes = newCumulativeSecondTime % 3600;
        // Get the minutes rounded down to the nearest int.
        minutes = remainingMinutes / 60;
        // Get the remaining seconds by calculating the remainder of the remaining minutes by/modulo 60.
        int remainingSeconds = remainingMinutes % 60;
        seconds = remainingSeconds;
    }
}
