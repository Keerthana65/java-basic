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
public class JavaString {

    public static void main(String[] args) {
        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        String s = new String(ch);

        System.out.println(s);

        String a = "Keerth";
        a.concat("ana");
        String y = a.concat("ana");
        System.out.println(a);
        System.out.println(y);
        
        String b = "Welcome"; // These are String literal 
        String b1 = new String("Welcome"); // Using new keyword 
        
        System.out.println(b);
        System.out.println(b1);
        
        // Using CharAt
        String name = new String("Students");
        char ch1 = name.charAt(5);
        System.out.println("CharAt is:"+ch1);
        
        
    }
}
