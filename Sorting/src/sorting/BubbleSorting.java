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
public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {2,1,47,15,36,48,12};
        int n = 7;
        int max = arr[0];
      for(int k=0; k<n; k++){
          if(max<arr[k]){
              max = arr[k];
          }
          
      }
      System.out.println("Maximum Value is:"+max);
      
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-1); j++) {
                int k = j+1; //1
                int a = arr[j]; //2
                int b = arr[k]; // 1
            
            if(b<a){
               int temp1 = a;
               int temp2 = b;
               arr[j] = b;
               arr[k] = a;
                   }
            }
        }
        for (int d = 0; d < n; d++) {
            System.out.println(arr[d]+"");
            
        }
        
    }
    
    
}
