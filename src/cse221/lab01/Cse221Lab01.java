        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221.lab01;

/**
 *
 * @author Mahin
 */
public class Cse221Lab01 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {


        Cse221Lab01 myGraphConverter = new Cse221Lab01();

        AdjacencyMatrix myMatrix = myGraphConverter.hardCodeAdjacencyMatrix();

        AdjacencyList myList = myGraphConverter.hardCodeAdjacencyList();

        for (int i = 0; i < myList.getNumNodes(); i++) {
            System.out.println((myList.getNodes()[i]).ShowList());
        }

        System.out.println(myMatrix);

    }
    public AdjacencyList hardCodeAdjacencyList() {
        //  This is a method to use an adjacency list data structure to
        //  store the graph demonstrated in the slides for tonights live class
        int n = 8;
        char[] l = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        // Hard code an equivalent adjacency list
        AdjacencyList myList = new AdjacencyList(n, l);
        AdjacencyNode node1 = new AdjacencyNode('B', 15);
        AdjacencyNode node2 = new AdjacencyNode('C', 14);
        myList.getNodes()[0] = new AdjacencyNode('A', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('D', 19);
        node1.setLink(node2);
        node1 = new AdjacencyNode('A', 15);
        node2 = new AdjacencyNode('D', 11);
        // list for A completed

        myList.getNodes()[1] = new AdjacencyNode('B', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('F', 28);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('H', 12);
        node1.setLink(node2);
        // list for B completed

        node1 = new AdjacencyNode('A', 14);
        node2 = new AdjacencyNode('D', 7);
        myList.getNodes()[2] = new AdjacencyNode('C', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('E', 16);
        node1.setLink(node2);
        node1 = node1.getLink();
        // list for C completed

        node1 = new AdjacencyNode('A', 19);
        node2 = new AdjacencyNode('B', 11);
        myList.getNodes()[3] = new AdjacencyNode('D', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('C', 7);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('E', 12);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('F', 24);
        node1.setLink(node2);
        // list for D completed

        node1 = new AdjacencyNode('C', 16);
        node2 = new AdjacencyNode('D', 12);
        myList.getNodes()[4] = new AdjacencyNode('E', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('G', 20);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('H', 9);
        node1.setLink(node2);
        // list for E completed

        node1 = new AdjacencyNode('B', 28);
        node2 = new AdjacencyNode('D', 24);
        myList.getNodes()[5] = new AdjacencyNode('F', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('G', 6);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('H', 13);
        node1.setLink(node2);
        // list for F completed

        node1 = new AdjacencyNode('E', 20);
        node2 = new AdjacencyNode('F', 6);
        myList.getNodes()[6] = new AdjacencyNode('G', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('H', 5);
        node1.setLink(node2);
        node1 = node1.getLink();
        // list for G completed

        node1 = new AdjacencyNode('B', 12);
        node2 = new AdjacencyNode('E', 9);
        myList.getNodes()[7] = new AdjacencyNode('H', 0, node1);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('F', 13);
        node1.setLink(node2);
        node1 = node1.getLink();
        node2 = new AdjacencyNode('G', 5);
        node1.setLink(node2);
        // list for H completed

        return myList;
    }

    public AdjacencyMatrix hardCodeAdjacencyMatrix() {
        //  This is a method to use an adjacency matrix data structure to
        //  store the graph demonstrated in the slides for tonights live class
        int n = 8;
        char[] l = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int[][] x = {{0, 1, 1, 1, 0, 0, 0, 0}, {1, 0, 0, 1, 0, 1, 0, 1}, {1, 0, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1}, {0, 1, 0, 1, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1, 0, 1}, {0, 1, 0, 0, 1, 1, 1, 0}};
        int[][] w = {{0, 15, 14, 19, 0, 0, 0, 0}, {15, 0, 0, 11, 0, 28, 0, 12}, {14, 0, 0, 7, 16, 0, 0, 0},
            {19, 11, 7, 0, 12, 24, 0, 0}, {0, 0, 16, 12, 0, 0, 20, 9}, {0, 28, 0, 24, 0, 0, 6, 13},
            {0, 0, 0, 0, 20, 6, 0, 5}, {0, 12, 0, 0, 9, 13, 5, 0}};

        AdjacencyMatrix myMatrix = new AdjacencyMatrix(n, l, x, w);

        return myMatrix;
    }
  
}
    