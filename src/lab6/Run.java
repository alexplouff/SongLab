/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

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

        
        List<Song> list = new ArrayList();
        
        list.add(new Song("The Beatles" , "Hey Jude", "Paul" , "F"));
        list.add(new Song("Weezer" , "My Name Is Jonas", "Rivers" , "D"));
        list.add(new Song("Radish" , "Guitar", "Ben" , "A"));
        list.add(new Song("Test" , "Lemon" , "None" , "G"));
        
        Collections.sort(list, new FirstNoteComparator());
        System.out.println(list);
        
    }
}
