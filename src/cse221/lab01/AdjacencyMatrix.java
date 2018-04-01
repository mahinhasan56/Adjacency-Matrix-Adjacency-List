/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221.lab01;

/**
 *
 * @author Mahin
 */
public class AdjacencyMatrix {int numNodes;
     int[][] matrix;
     int[][] weights;
     char[] nodeNames;
    
    /** Creates a new instance of AdjacencyMatrix */
    public AdjacencyMatrix(int n, char [] names) {
      numNodes = n;
      matrix = new int[n][n];
      weights = new int[n][n];
      nodeNames = names;
    }
    public AdjacencyMatrix(int n, char [] names, int [][] m, int [][] w) {
      numNodes = n;
      matrix = m;
      weights = w;
      nodeNames = names;
    }  
    
    // This method is used to align all values so the matrix will print in columns
    public static String setW(int x, int size) {
      String ans = "";
      String ans2 = "" + x;
      for (int i = 0; i < size - ans2.length(); i++)
        ans = ans + " ";
      ans = ans + ans2;
      
      return ans;
    }
    
    public String printMatrix(int [][] temp) {
      int i, j;
      String s = "";
      
      for (i = 0; i < getNumNodes(); i++)
      {
        for (j = 0; j < getNumNodes(); j++)
          s += setW(temp[i][j],5);    // have each value of the matrix take 5 spaces
        s += "\n";
      }
      return s;
    }
    
    public String toString() {
      String answer = "The number of nodes is " + getNumNodes() + "\n\n";
      
      answer += "The adjacency Matrix is:\n";
      answer += printMatrix(getMatrix());
      answer += "\nThe matrix of weights is:\n";
      answer += printMatrix(getWeights());
      
      return answer;
    }
    
    public int getNumNodes() {
      return numNodes;
    }
    
    public void setNumNodes(int numNodes) {
      this.numNodes = numNodes;
    }
    
    public int[][] getMatrix() {
      return matrix;
    }
    
    public void setMatrix(int[][] matrix) {
      this.matrix = matrix;
    }
    
    public int[][] getWeights() {
      return weights;
    }
    
    public void setWeights(int[][] weights) {
      this.weights = weights;
    }
    
    public char[] getNodeNames() {
      return nodeNames;
    }
    
    public void setNodeNames(char[] nodeNames) {
      this.nodeNames = nodeNames;
    }
    
    
}
