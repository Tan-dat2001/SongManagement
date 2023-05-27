package SongManagement;

public class ClockTime {
    private int minute;
    private int second;

    public ClockTime(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMintue(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
