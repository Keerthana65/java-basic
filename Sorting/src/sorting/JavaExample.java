/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Keerthana
 */
public class JavaExample {
    public static void main(String[] args) {
        int num [] = {56,45,2,3,48,6,75};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum Value is:"+max);
        
        for (int j = 0; j < num.length; j++) {
            if(min > num[j]){
                min = num[j];
            }
        }
        System.out.println("Minimum Value is:"+min);
    }
}
