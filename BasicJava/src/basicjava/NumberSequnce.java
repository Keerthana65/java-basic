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
public class NumberSequnce {

    public static void main(String[] args) {
        
        //USING CONTINUE & BREAK 
        for (int i = 0; i <= 50; i++) {
            if (i > 20) {
                break;
            }
            else if (i % 2 == 0) {
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
