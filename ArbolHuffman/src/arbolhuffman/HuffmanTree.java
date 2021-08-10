/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhuffman;

/**
 *
 * @author Juan Jose Perez
 */
import java.util.*;
public class HuffmanTree implements Comparable<HuffmanTree>{
     public final int frequency; // the frequency of this tree
    public HuffmanTree(int freq) { frequency = freq; }

    // compares on the frequency
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
    
//    public final int frequency; // the frequency of this tree
//    public HuffmanTree(int freq) { frequency = freq; }
// 
//    // compares on the frequency
//    public int compareTo(HuffmanTree tree) {
//        return frequency - tree.frequency;
//    }
    
}
