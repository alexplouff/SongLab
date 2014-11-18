package common;

import java.util.Objects;

public class Song  {
    
    
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
    
    public String toString(){
        return "Band Name: " + band +
                "\nSong Title: " + songTitle +
                "\nTime Writer: " + songWriter +
                "\nFirst Note: " + firstNote + "\n\n";
                   
                        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.band);
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
        return true;
    }

//    @Override
//    public int compareTo(Song o) {
//
//        return this.songTitle.compareTo( o.getSongTitle());
//    }
    
    
    
    
    
}
