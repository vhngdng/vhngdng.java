package mypack.animal;

import java.util.Scanner;
import java.lang.Iterable;
import javax.sound.sampled.SourceDataLine;

public class Movie extends FilmList {
    protected int duration;

    public Movie(String id, String title, TYPE type, double ranking, int duration) {
        setID(id);
        setTitle(title);
        setType(type);
        setRanking(ranking);
        setDuration(duration);

    }

    public int getDuration() {
        return this.duration;
    }

    public int setDuration(int duration) {
        return this.duration = duration;
    }

    public String toString() {
        String text = "ID: " + getID() + " | title: " + getTitle() + " | type: " + getType() + " | ranking: "
                + getRanking() + " | duration " + duration;

        return text;
    }

}