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

class A{ //Super Class
    public int add(int i,int j){
        return (i+j);   
    }
}

class B extends A{ // Child Class or Sub Class
    public int sub(int i,int j){
        return (i-j); 
    }
}

class C extends B{
    public int multi(int i,int j){
        return (i*j);  
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        C c = new C();
        int r1 = c.add(5,2);
        int r2 = c.sub(10,5);
        int r3 = c.multi(2,6);
        
        System.out.println("Value is:" +r1);
        System.out.println("Value is:" +r2);
        System.out.println("Value is:" +r3);
    }
}
