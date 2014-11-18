/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lab1.Song;

/**
 *
 * @author Alex
 */
public class Run {
    
    
    public static void main(String[] args) {
        
    
    Song beatlesSong = new Song("The Beatles" , "Hey Jude", "Paul" , "F");
    Song weezerSong = new Song("Weezer" , "My Name Is Jonas", "Rivers" , "Dm");
    Song radishSong = new Song("Radish" , "Guitar", "Ben" , "Am");
    Song testSong = new Song("Test" , "Lemon" , "None" , "None");
    Song nextTestSong = new Song("AAA", "AAA", "zzz","AAA");
       
    TreeSetStorage t = new TreeSetStorage();
    t.addSong(testSong);
    t.addSong(radishSong);
    t.addSong(beatlesSong);
    t.addSong(weezerSong);
    t.addSong(nextTestSong);
    
    for(Object song : t.getSet()){
        System.out.println(song);
    }
  
    }
}
