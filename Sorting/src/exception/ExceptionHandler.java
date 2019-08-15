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
public class ExceptionHandler {

    public static void main(String[] args) {
        /* int d = 0;
        int n = 20;   
        int fraction = n / d;
        System.out.println("End Of Main");*/
 /* Using Exception Handling- Only try-catch method*/
 /*   int d = 0;
        int n = 20;
        try {
            int fraction = n / d;
            System.out.println("This line will not be Executed");
        } catch (ArithmeticException e) {
            System.out.println("In the catch Block due to Exception = " + e);
        }
        System.out.println("End Of Main");*/
 
 /* Using Exception Handling- Only try-catch method & finally method*/
        try {
            int d = 0;
            int n = 20;
            int fraction = n / d;
            
        } catch (ArithmeticException e) {
            System.out.println("In the catch Block due to Exception = " + e);
        } finally {
            System.out.println("End Of Main");
        }
    }
}
