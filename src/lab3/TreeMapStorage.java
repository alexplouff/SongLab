/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Map;
import java.util.TreeMap;
import lab1.Song;
/**
 *
 * @author Alex
 */
public class TreeMapStorage {
    
    private Map<String,Song> songTreeMap;
    
    public TreeMapStorage(){
        songTreeMap = new TreeMap<>();
    }
    
    public void addToTreeMap( Song song ){
        songTreeMap.put(song.getSongTitle(),song);
    }
    
    public Map getTreeMap(){
        return songTreeMap;
    }
    
    
}
