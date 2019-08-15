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
public class JavaCross {
    public static void main(String[] args) {
        int i,j;
        
        for(i=1; i<=6; i++){
            for(j=1; j<=6;j++){
                if((i==j)|| (i+j==7)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
}
}
