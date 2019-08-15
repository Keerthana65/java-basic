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
public class JavaPatterns {
    public static void main(String[] args) {
        int i,j;
        
        for ( i = 1; i <=10; i++) {
            for ( j = 1; j <=10; j++) {
                if((i==1)||(i==10)||(j==1)||(j==10)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
