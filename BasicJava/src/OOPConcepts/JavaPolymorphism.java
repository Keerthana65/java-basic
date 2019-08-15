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
//Overloading & These are complie time polymorphism
class calculation {

    public int add(int i) {
        return i;
    }

    public int add(int i, int j) {
        return (i + j);
    }

    public int add(int i, int j, int k) {
        return (i + j + k);
    }
}

//Overriding & These are run time polymorphism
class advanceCal extends calculation {
//    public int add(int i, int j){
//        return (i+j);
//    }

//     public int add(int i,int j,int k){
//        return (i+j+k);    
//    }
}

public class JavaPolymorphism {

    public static void main(String[] args) {
        advanceCal cal = new advanceCal();
//        cal.add(5,2);
        System.out.println("Value is:" + cal.add(5, 3));

    }
}
