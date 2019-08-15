/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Keerthana
 */
public class Overloading {

    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int num, char d) {
//        System.out.println(c);
        System.out.println(c + " " + num + " " + d);
    }
}

class Sample {

    public static void main(String args[]) {
        Overloading obj = new Overloading();
        obj.disp('a');
        obj.disp('a', 10, 'b');
    }
}
