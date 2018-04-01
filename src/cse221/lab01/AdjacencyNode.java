/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221.lab01;

/**
 *
 * @author Mahin
 */
public class AdjacencyNode {
     private char NodeValue;
     private int weight;
     private AdjacencyNode link;
      
     /** Creates a new instance of AdjacencyNode */
     public AdjacencyNode(char let, int w) {
         NodeValue = let;
         weight = w;
         link = null;
     }
  
     public AdjacencyNode(char let, int w, AdjacencyNode l) {
         NodeValue = let;
         weight = w;
         link = l;
     }
  
     public void setLink(AdjacencyNode l) {
         link = l;
     }
      
     public void setWeight(int w) {
         weight = w;
     }
      
     public void setNodeValue(char l) {
         NodeValue = l;
     }
      
     public AdjacencyNode getLink() {
         return link;
     }
  
     public int getWeight() {
         return weight;
     }
      
     public char getNodeValue() {
         return NodeValue;
     }
      
     public String ShowList() {
         String answer = "The list for " + this.getNodeValue() + " has - ";
         AdjacencyNode temp = this.getLink();
         while (temp != null) {
             answer += temp.getNodeValue() + " with weight " + temp.getWeight() + " ";
             temp = temp.getLink();
         }
         return answer;
     }
}
