/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Set;
import java.util.TreeSet;
import lab1.Song;
/**
 *
 * @author Alex
 */
public class TreeSetStorage {
    
    private Set<Song> songList;
    
    public TreeSetStorage(){
        songList = new TreeSet<>();
    }
    
    public void addSong(Song song){
        songList.add(song);
    }
    
    public Set getSet(){
        return songList;
    }
    
}
