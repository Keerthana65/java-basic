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
public class SelectionSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr ={2,8,15,1,24,13,4};
        int n = 7;
        for(int i=1; i<=n; i++){
            for (int j = 0; j < (n-1); j++) {
                int k = j+1;
                int a = arr[j]; // 2
                int b = arr[k]; //8
            
            if(b<a){
               int temp1 = a;
               int temp2 = b;
               arr[j] = b;
               arr[k] = a;
                   }
            }
        }
        for(int d=0; d<n; d++){
            System.out.println(arr[d]+"");
        }
    }
    
}
