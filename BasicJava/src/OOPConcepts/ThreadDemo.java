/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPConcepts;

/**
 *
 * @author Keerthana
 */

class MyTask extends Thread{
//    @Override
    public void executeTask(){
         for(int a=1; a<=10; a++){
            System.out.println("Printing Documents #"+a+" - Printer2");
        }
    }
}
public class ThreadDemo {
    // main method represents main thread
    public static void main(String[] args) {
        // whatever we write in here will be executed by main thread
        // threads always execute the jobs in a sequence
        // Execution Context
        
        System.out.println("==Application Started==");
        
        MyTask task = new MyTask();
        task.executeTask();
        
        //Some code to print the documents
        for(int a=1; a<=10; a++){
            System.out.println("Printing Documents #"+a+" - Printer1");
        }
        
        System.out.println("==Application Finished==");
        
    }
}
