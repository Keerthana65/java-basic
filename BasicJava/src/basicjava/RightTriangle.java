/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author Keerthana
 */
public class RightTriangle {
    public static void main(String[] args) {
        int num = 10;
        
        for (int i =1; i <=num; i++) {
            for (int j =1; j <=(num-i); j++) {
                System.out.print("   ");
            }
            
            for (int k =1; k <=i; k++) {
                System.out.print(" * ");
            }
             System.out.println("");
        }
       
    }
}
