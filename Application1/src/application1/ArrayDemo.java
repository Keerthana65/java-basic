/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;

/**
 *
 * @author Keerthana
 */
public class ArrayDemo {

    public static void main(String[] args) {
        /**
         * 1D Array*
         */
//        Method01
//        int nums[] = new int[4];

//        nums[0]=8;
//        nums[1]=12;
//        nums[2]=25;
//        nums[3]=32;
// Method02
//        int nums[] = {8, 12, 25, 32};
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Array:" + nums[i]);
//        }
        /**
         * 1D Array*
         */
        /**
         * 2D Array*
         */
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 4, 6, 8};
        int c[] = {5, 6, 7, 8};

        int d[][] = {
            {1, 2, 3, 4},
            {2, 4, 6, 8},
            {5, 6, 7, 8}
        };
        for (int i = 0; i < 3; i++) { //row
            for (int j = 0; j < 4; j++) { //cloumn
                System.out.print(d[i][j]);
            }

            System.out.println();
        }

        /**
         * 2D Array*
         */
    }

}
