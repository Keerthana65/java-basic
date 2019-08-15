/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keerthana
 */
public class ListExample {

    public static void main(String[] args) {
        List<Integer> cal = new ArrayList<>();

        cal.add(12);
        cal.add(5);
        cal.add(7);
        cal.add(10);
        cal.add(4);

        System.out.println(cal);

        System.out.println("sorting.ListExample.main()");

        int arr[] = {2, 56, 4, 34, 12, 6};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
         for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + "\t");
         }
         
         System.out.println();
         for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + "\t");
        }
         
         
    }
}
