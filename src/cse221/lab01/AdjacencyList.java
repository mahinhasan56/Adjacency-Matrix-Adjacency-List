/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221.lab01;

/**
 *
 * @author Mahin
 */
public class AdjacencyList {
    private int numNodes;
     private char [] letters;
     private AdjacencyNode [] nodes;
     /** Creates a new instance of AdjacencyList */
     public AdjacencyList(int s) {
         numNodes = s;
         letters = new char[s];
         nodes = new AdjacencyNode[s];
     }
      
     public AdjacencyList(int s, char [] l) {
         numNodes = s;
         letters = l;
         nodes = new AdjacencyNode[s];
     }
  
     public int getNumNodes() {
         return numNodes;
     }
  
     public void setNumNodes(int numNodes) {
         this.numNodes = numNodes;
     }
  
     public char[] getLetters() {
         return letters;
     }
  
     public void setLetters(char[] letters) {
         this.letters = letters;
     }
  
     public AdjacencyNode[] getNodes() {
         return nodes;
     }
  
     public void setNodes(AdjacencyNode[] nodes) {
         this.nodes = nodes;
 }
    
}
