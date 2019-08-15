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
public class Overriding {

    public void eat() {
        System.out.println("Human is eating");
    }
}

class Boy extends Overriding {
    //Overriding method

    public void eat() {
        System.out.println("Boy is eating");
    }

    public static void main(String args[]) {
        Boy obj = new Boy();
        //This will call the child class version of eat()
//        Overriding obj2 = new Overriding();
//        obj2.eat();
        obj.eat();
    }
}


