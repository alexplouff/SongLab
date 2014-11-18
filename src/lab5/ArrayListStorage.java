/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import lab1.Song;

/**
 *
 * @author Alex
 */
public class ArrayListStorage {
    
    private List songList;
    
    public ArrayListStorage(){
        songList = new ArrayList<>();
    }
    
    public void addSong(Song song){
        songList.add(song);
    }
    
    public List getList(){
        return songList;
    }
}
