/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhuffman;

import static arbolhuffman.HuffmanCode.buildTree;
import static arbolhuffman.HuffmanCode.printCodes;
import java.util.Scanner;

/**
 *
 * @author Juan Jose Perez
 */
public class ArbolHuffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String pal = sc.next(); 
        char[] test2 = pal.toCharArray();
        int [][] charFreqs = new int[256][256];
        for (char c : pal.toCharArray())
        charFreqs[c][c]++;
        //int[] charFreqs = {36,18,12,9,7,6,5,4};
        
        HuffmanTree tree = buildTree(charFreqs,test2);

        // print out results
        System.out.println("SYMBOL\tFREQ\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
 
        // we will assume that all our characters will have
        // code less than 256, for simplicity
        //int[] charFreqs = new int[256];
        // read each character and record the frequencies
//        for (char c : test.toCharArray())
//            charFreqs[c]++;
// 
//        // build tree
//        HuffmanTree tree = buildTree(charFreqs);
// 
//        // print out results
//        System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
//        printCodes(tree, new StringBuffer());
    
    }
    
}
