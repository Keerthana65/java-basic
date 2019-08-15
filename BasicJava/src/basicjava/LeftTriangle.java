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
public class LeftTriangle {
    public static void main(String[] args) {
        int i,j;
        
        for ( i = 0; i <=10; i++) {
            for ( j = 0; j <i; j++) {
                System.out.print(" * ");
            }
             System.out.println();
        }
    }
}
