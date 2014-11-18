package lab1;

import java.util.Objects;

public class Song implements Comparable<Song> {

    private String band;
    private String songTitle;
    private String songWriter;
    private String firstNote;

    public Song(String band, String songTitle, String songWriter, String firstNote) {
        this.band = band;
        this.songTitle = songTitle;
        this.songWriter = songWriter;
        this.firstNote = firstNote;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public String getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(String firstNote) {
        this.firstNote = firstNote;
    }

    public String toString() {
        return "Band Name: " + band
                + "\nSong Title: " + songTitle
                + "\nTime Writer: " + songWriter
                + "\nFirst Note: " + firstNote + "\n\n";

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.band);
        hash = 59 * hash + Objects.hashCode(this.songTitle);
        hash = 59 * hash + Objects.hashCode(this.songWriter);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.band, other.band)) {
            return false;
        }
        if (!Objects.equals(this.songTitle, other.songTitle)) {
            return false;
        }
        if (!Objects.equals(this.songWriter, other.songWriter)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Song o) {

        int result = this.getSongWriter().compareTo(o.getSongWriter());
        String otherObject = o.toString();

        if (result == 0) {
            return 0;
        } else if (result > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
