/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhuffman;

import java.util.PriorityQueue;

/**
 *
 * @author Juan Jose Perez
 */
public class HuffmanCode {
    
    // input is an array of frequencies, indexed by character code
    public static HuffmanTree buildTree(int[] charFreqs, char[] test2) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], test2[i]));

        assert trees.size() > 0;
        // loop until there is only one tree left
        while (trees.size() > 1) {
            // two trees with least frequency
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();

            // put into new node and re-insert into queue
            trees.offer(new HuffmanNode(a, b));
        }
        return trees.poll();
    }

    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;

            // print out character, frequency, and code for this leaf (which is just the prefix)
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;

            // traverse left
            prefix.append('0');
            printCodes(node.izq, prefix);
            prefix.deleteCharAt(prefix.length()-1);

            // traverse right
            prefix.append('1');
            printCodes(node.der, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    
//     public static HuffmanTree buildTree(int[] charFreqs) {
//        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
//        
//        for (int i = 0; i < charFreqs.length; i++)
//            if (charFreqs[i] > 0)
//                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
// 
//        assert trees.size() > 0;
//        // loop hasta que queda solo un arbol
//        while (trees.size() > 1) {
//            // dos arboles con menos frecunecia
//            HuffmanTree a = trees.poll();
//            HuffmanTree b = trees.poll();
// 
//            // se pone en un nuevo nodo y reinserta en queue
//            trees.offer(new HuffmanNode(a, b));
//        }
//        return trees.poll();
//    
//}
//      public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
//        assert tree != null;
//        if (tree instanceof HuffmanLeaf) {
//            HuffmanLeaf leaf = (HuffmanLeaf)tree;
// 
//            // imprime los caracteres, frecuencia, y codigo para esta hoja (la cual es el prefix)
//            System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);
// 
//        } else if (tree instanceof HuffmanNode) {
//            HuffmanNode node = (HuffmanNode)tree;
// 
//            // codifica el lado izquierdo
//            prefix.append('0');
//            printCodes(node.izq, prefix);
//            prefix.deleteCharAt(prefix.length()-1);
// 
//            // codifica el lado derecho
//            prefix.append('1');
//            printCodes(node.der, prefix);
//            prefix.deleteCharAt(prefix.length()-1);
//        }
    }
}
