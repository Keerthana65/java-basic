/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star;

/**
 *
 * @author Keerthana
 */
public class JavaStar {

    public static void main(String[] args) {
        int i, j;

        for (i = 6; i >= 1; i--) {
            for (j = 1; j < i; j++) {

                System.out.print("*");
            }

            System.out.println(" ");
        }
        
        System.out.println();
        
        for (i = 1; i <= 6; i++) {
            for (j = 1; j < i; j++) {

                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
