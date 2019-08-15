/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Keerthana
 */
/*
public class Thread3 extends Thread{
    //Single task by multiple threads - Extending thread
    public void run(){
        System.out.println("I'm One");
    }
    
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        t1.start();
        t2.start();
    }
}*/

public class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm One ");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread3());
        Thread t2 = new Thread(new Thread3());
        t1.start();
        t2.start();
    }
}