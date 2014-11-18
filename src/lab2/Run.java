/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
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

    HashMapSongStorage h = new HashMapSongStorage();

    
    Song beatlesSong = new Song("The Beatles" , "Hey Jude", "Paul" , "F");
    Song weezerSong = new Song("Weezer" , "My Name Is Jonas", "Rivers" , "Dm");
    Song radishSong = new Song("Radish" , "Guitar", "Ben" , "Am");
     Song song4 = new Song("Led Zeplin" , "Stairway To Heaven" , "Robert P" , "F");
    //    System.out.println(h.getSongMap());
    
    Map<String,Song> songMap = new HashMap<>();
    songMap.put(beatlesSong.getSongTitle(), beatlesSong);
    songMap.put(weezerSong.getSongTitle(), weezerSong);
    songMap.put(radishSong.getSongTitle(), radishSong);
    songMap.put(song4.getSongTitle(), song4);
    
    for(String key : songMap.keySet() ){
        System.out.println(songMap.get(key));
    

       }
    Map<String,Song> secondMap = new LinkedHashMap<>(songMap);
        
       // secondMap.putAll(h.getSongMap());
        System.out.println("--------------\n");
        System.out.println(secondMap);

    }
}