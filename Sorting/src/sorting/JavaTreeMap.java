/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.TreeMap;

/**
 *
 * @author Keerthana
 */
public class JavaTreeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
        
        treemap.put(1,"Cat");
        treemap.put(2,"Dog");
        treemap.put(3,"Cow");
        treemap.put(4,"Puppy");
        treemap.put(5,"Crow");
        
        System.out.println(treemap);
        
        
        
    }
}
