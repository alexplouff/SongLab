/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lab1.Song;

/**
 *
 * @author Alex
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Song beatlesSong = new Song("The Beatles" , "Hey Jude", "Paul" , "F");
    Song weezerSong = new Song("Weezer" , "My Name Is Jonas", "Rivers" , "Dm");
    Song radishSong = new Song("Radish" , "Guitar", "Ben" , "Am");
    Song testSong = new Song("Test" , "Lemon" , "None" , "None");
        
    TreeMapStorage t = new TreeMapStorage();
    
    t.addToTreeMap(beatlesSong);
    t.addToTreeMap(weezerSong);
    t.addToTreeMap(radishSong);
    t.addToTreeMap(testSong);
    
    for(Object key : t.getTreeMap().keySet()){
        System.out.println(t.getTreeMap().get(key));
    }
    
        System.out.println("-------- <--------> ---------\n");
    
    List<Song> songList = new ArrayList<>(t.getTreeMap().values());
        
        Collections.sort(songList);
        
        System.out.println(songList);
        
        
        
    }
    
    
    
    
    
    
}
