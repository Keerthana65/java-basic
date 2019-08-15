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
public class JavaPatterns {

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 8; i++) {

            for (j = 1; j <= 8; j++) {
                if ((i == 1) || (i == 8) || (j == 1) || (j == 8)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
             System.out.println();
        } 
    }
}
