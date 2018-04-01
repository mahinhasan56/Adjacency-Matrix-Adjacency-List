/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221.lab01;

/**
 *
 * @author Faysal
 */
public class Array {

    public static void main(String[] args) {
        int array[] = {34, 65, 23, 67, 33};


        for (int c = 0, j = array.length - 1; c < array.length; c++, j--) {
            System.out.print(array[j] + " , ");

        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i]>max) {
                max = array[i];
                
            }
        

        }
        
        System.out.println("MAX IS " + max);
        
        int min= array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i]<min) {
                min = array[i];
                
            }
        

        }
        
        System.out.println("MIN IS " + min);
        
        max = array[0];
        int pos=0;
        for (int i = 1; i < array.length; i++) {
            if ( array[i]>max) {
                max = array[i];
                
                    
            }else{
                pos=pos+1;
            }
     
        
       
        } 
       
        
    }
}
