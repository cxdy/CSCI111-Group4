package csci111.group4;

public class ComboLock {

    int[] combo = {0, 0, 0};
    int[] attempt = {0, 0, 0};

    public ComboLock(int one, int two, int three){
        if (one < 0) { combo[0] = 0; } else if(one > 39) { combo[0] = 39; } else { combo[0] = one; }
        if (two < 0) { combo[1] = 0; } else if(two > 39) { combo[1] = 39; } else { combo[1] = two; }
        if (three < 0) { combo[2] = 0; } else if(three > 39) { combo[2] = 39; } else { combo[2] = three; }
    }

    public void reset() {
        attempt[0] = 0;
        attempt[1] = 0;
        attempt[2] = 0;
    }

    public int turnClockwise(int turn, int position) {
        if (turn + attempt[position] > 39) {
            attempt[position] = turn % 39;
        } else if (turn <= 0) {
            attempt[position] = 0;
        }
        return attempt[position];
    }

    public int turnCounterClockwise(int turn, int position) {
        if (turn + attempt[position] > 39) {
            attempt[position] = turn % 39;
        } else if (turn <= 0) {
            attempt[position] = 0;
        }
        return attempt[position];
    }

    public boolean open(){
        if(combo[0] == attempt[0] && combo[1] == attempt[1] && combo[2] == attempt[2]) {
            return true;
        } else {
            return false;
        }
    }
}
