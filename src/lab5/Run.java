/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Collections;
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
       
    ArrayListStorage a = new ArrayListStorage();
    a.addSong(testSong);
    a.addSong(beatlesSong);
    a.addSong(weezerSong);
    a.addSong(radishSong);
    
        System.out.println(a.getList());
    
    Collections.sort(a.getList());
        System.out.println(a.getList());
    
    
    
    
    }
    
}
