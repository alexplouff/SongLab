/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lab1.Song;
/**
 *
 * @author Alex
 */
public class HashMapSongStorage {
    
    private Map<String,Song> songMap;
    
    public HashMapSongStorage(){
        songMap = new HashMap<>();
    }
    
    public void addSongToMap( String band, String songName, String writer, String firstNote ){
        Song song = new Song( band, songName, writer, firstNote);
        songMap.put(songName, song);
    }
    
    public Map getSongMap(){
        
        
        return songMap;
    }
    
    
    
    public void printFromKeys( ){
        Set<String> keys = songMap.keySet();
        for( String key : keys ){
            Song s = songMap.get(key);
            System.out.println(s);
        }
        
    }
}
