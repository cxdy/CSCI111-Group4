public class WallClock {

    // The three int values that when used in tandem represent a WallClock instance's current time.
    private int hours;
    private int minutes;
    private int seconds;

    // A constructor that takes no arguments and instantiates hours, minutes, and seconds to zero.
    public WallClock() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // A method that sets the clock to zero hundred hours.
    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // A method called by the user when they want to advanced the time on the clock forward.
    public void forward(int secondsForward) {
        // Call the computeNewTime method with the seconds passed into the forward method.
        computeNewTime(secondsForward);
    }

    // A method called by the user when they want to turn the time back on the clock.
    public void reverse(int secondsBack) {
        // Call the computeNewTime method with the negative seconds passed into the reverse method.
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
        // Get the remaining minutes from calculating the remainder when dividing out hours.
        int remainingMinutes = newCumulativeSecondTime % 3600;
        // Get the minutes rounded down to the nearest int.
        minutes = remainingMinutes / 60;
        // Get the remaining seconds by calculating the remainder of the remaining minutes by/modulo 60.
        int remainingSeconds = remainingMinutes % 60;
        seconds = remainingSeconds;
    }
}
