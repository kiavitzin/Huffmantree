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
public class HuffmanLeaf extends HuffmanTree{
    public final char value; // caracter que esta hoja representa
 
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;
    }
    
}
