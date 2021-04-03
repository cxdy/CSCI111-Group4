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

        int hrs = i / 3600;
        int extraHrs = i - hrs * 3600;
        int mins = extraHrs / 60;
        int secs = extraHrs - mins * 60;

        // if the hours are less than 23, set it
        if (hrs <= 23) {
            hours = hrs;
        }

        if (mins <= 59) {
            minutes = mins;
        }

        if (secs <= 59) {
            seconds = secs;
        }

    }

    public void Forward(int i) {
        // save old values
        int oldHours = hours;
        int oldMinutes = minutes;
        int oldSeconds = seconds;

        // convert i (seconds) to hh:mm:ss format
        Convert(i);

        // init comparison variables
        int fwdHrs;
        int fwdMins;
        int fwdSecs;

        // if the sum of the oldHrs and new hrs is less than or equal to 12, add together
        // this math is all wrong, but the script kind of works
        if (oldHours + hours < 12) {
            fwdHrs = oldHours + hours;
        } else {
            fwdHrs = (oldHours + hours) - 12;
        }

        if (oldMinutes + minutes <= 59) {
            fwdMins = oldMinutes + minutes;
        } else {
            fwdMins = (oldMinutes + minutes) - 59;
        }

        if (oldSeconds + seconds <= 59) {
            fwdSecs = oldSeconds + seconds;
        } else {
            fwdSecs = (oldSeconds + seconds) - 59;
        }

        hours = fwdHrs;
        minutes = fwdMins;
        seconds = fwdSecs;

    }

    public void Reverse(int i) {
        // Reverse class

        // Weird bug
        // TIME> forward 60
        // The new time is: 23:59:00
        // TIME> forward 60
        // The new time is: 23:01:00
        // TIME> forward 3540
        // The new time is: 23:01:00
        // TIME> reverse 3600
        // The new time is: 45:01:00

        // keep the old (current) time
        int oldHours = hours;
        int oldMinutes = minutes;
        int oldSeconds = seconds;

        // convert the time in seconds to hr:mm:ss
        Convert(i);

        // initialize the comparison variables
        int revHrs;
        int revMins;
        int revSecs;

        // if the old and new together are less than or equal to 24, safely subtract
        if (oldHours - hours >= 24) {
            revHrs = oldHours - hours;
        } else {
            // i think this is where my bug is
            revHrs = (oldHours - hours) + 23;
        }

        // same as above, but greater than or equal to
        if (oldMinutes - minutes <= 60) {
            revMins = oldMinutes - minutes;
        } else {
            revMins = (oldMinutes - minutes) + 59;
        }

        if (oldSeconds - seconds <= 60) {
            revSecs = oldSeconds - seconds;
        } else {
            revSecs = (oldSeconds - seconds) + 59;
        }

        // set the new time
        hours = revHrs;
        minutes = revMins;
        seconds = revSecs;

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
