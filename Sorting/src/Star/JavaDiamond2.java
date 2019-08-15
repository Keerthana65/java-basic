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
public class JavaDiamond2 {
    public static void main(String[] args) {
        int i,j;
        for( i=1; i<=6; i++){
            for( j=1; j<=5; j++){
                System.out.println(" ");
            }
            j--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
    }
}
