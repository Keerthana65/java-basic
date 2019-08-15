/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multitherating;

/**
 *
 * @author Keerthana
 */
public class Multithread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread time is" + e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Multithread mt1 = new Multithread();
        mt1.start();
        
    }
}
