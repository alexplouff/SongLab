/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import common.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Song song = new Song("The Beatles" , "Let It Be" , "Paul M" , "C#");
    
    Song song2 = new Song("The Beatles" , "I Me Mine" , "Paul M" , "Fm");
    
    Song song3 = new Song("The Beatles" , "Hey Jude" , "Ringo S" , "Am");
    
    Song song4 = new Song("Led Zeplin" , "Stairway To Heaven" , "Robert P" , "F");
    
    Song song5 = new Song("Weezer" , "My Name Is Jonas" , "Rivers C" , "Dm");
    
    Song song6 = new Song("The Beatles" , "Let It Be" , "Paul M" , "C#");
    
    List<Song> songList = new ArrayList<>(); 
    songList.add(song);
    songList.add(song2);
    songList.add(song3);
    songList.add(song5);
    songList.add(song4);
    songList.add(song6);
    
        System.out.println(songList);
    
        System.out.println("--- Sorted List By Title ----\n\n");
        
        
        System.out.println(songList);
    
    
    
    
    
    }
    
}
