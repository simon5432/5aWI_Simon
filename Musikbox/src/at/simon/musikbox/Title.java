package at.simon.musikbox;

import java.util.concurrent.atomic.AtomicInteger;

public class Title {
    private int length;
    private String songName;

    public Title(int length, String songName) {
        this.length = length;
        this.songName = songName;
    }

    public int getLength() {
        return length;
    }

    public String getSongName() {
        return songName;
    }
}
