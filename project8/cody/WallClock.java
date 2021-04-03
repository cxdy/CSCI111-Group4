package Project8;

public class WallClock {
    // Main class

    // define private fields
    private int hours;
    private int minutes;
    private int seconds;

    // constructor, sets default time to 00:00:00
    String WallClock() {
        hours = 00;
        minutes = 00;
        seconds = 00;
        return hours + ":" + minutes + ":" + seconds;
    }

    // reset method, resets time to default 00:00:00
    public void Reset() {
        hours = 00;
        minutes = 00;
        seconds = 00;
    }

    // conversion method: seconds -> hh:mm:ss
    public void Convert(int i) {
        // TODO
        // Minute 59 -> 60 does not roll over the hour, just the minute
        // Second 59 -> 60 does not roll over the minute, just the second
        // I would assume 1:59:59 when adding a second would not go to the next hour either

        int secs = i % 60;
        int hrs = i / 60;
        int mins = hours % 60;

        hours = hrs / 60;
        minutes = mins;
        seconds = secs;

    }

    public void Forward(int i){
        int oldHours = hours;
        int oldMinutes = minutes;
        int oldSeconds = seconds;

        Convert(i);

        int fixSeconds = 0;
        int fixMinutes = 0;
        int fixHours = 0;

        if (seconds + oldSeconds > 59){
            fixSeconds = (seconds + oldSeconds) - 59;
            fixMinutes += 1;
        } else {
            fixSeconds += seconds + oldSeconds;
        }

        if (minutes + oldMinutes > 59) {
            fixMinutes = (minutes + oldMinutes) - 59;
            fixHours += 1;
        } else {
            fixMinutes += minutes + oldMinutes;
        }

        if (hours + oldHours > 23) {
            fixHours += (hours + oldHours) - 23;
        } else {
            fixHours += hours + oldHours;
        }

        hours = fixHours;
        minutes = fixMinutes;
        seconds = fixSeconds;

    }


    public void Reverse(int i) {
        // Reverse class
        int oldHours = hours;
        int oldMinutes = minutes;
        int oldSeconds = seconds;

        Convert(i);

        int fixSeconds = 0;
        int fixMinutes = 0;
        int fixHours = 0;

        if (seconds - oldSeconds > 59){
            fixSeconds = (seconds - oldSeconds) - 59;
            fixMinutes -= 1;
        } else {
            fixSeconds -= seconds - oldSeconds;
        }

        if (minutes - oldMinutes > 59) {
            fixMinutes = (minutes - oldMinutes) - 59;
            fixHours -= 1;
        } else {
            fixMinutes -= minutes - oldMinutes;
        }

        if (hours - oldHours > 23) {
            fixHours -= (hours - oldHours) - 23;
        } else {
            fixHours -= hours - oldHours;
        }

        hours = fixHours;
        minutes = fixMinutes;
        seconds = fixSeconds;

    }

    public String getTime() {
        // initialize string variables for the time
        String hrs;
        String mins;
        String secs;

        // adding a single zero in front of single digit numbers
        // otherwise returning them as they are
        if (hours < 10) { hrs = "0" + hours; ; } else { hrs = Integer.toString(hours); }
        if (minutes < 10) { mins = "0" + minutes; } else { mins = Integer.toString(minutes); }
        if (seconds < 10) { secs = "0" + seconds; } else { secs = Integer.toString(seconds); }

        return hrs + ":" + mins + ":" + secs;
    }
}
