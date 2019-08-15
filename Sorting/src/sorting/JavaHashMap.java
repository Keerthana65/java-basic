/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Keerthana
 */
public class JavaHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        
        hashmap.put(1,"Cat");
        hashmap.put(2,"Dog");
        hashmap.put(3,"Ant");
        
        System.out.println(hashmap);
        System.out.println(hashmap.size());
        System.out.println(hashmap.get(3));
        System.out.println(hashmap.remove(2));
//        hashmap.clear();
        for(Map.Entry<Integer,String> entry: hashmap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " +value);
        }
        System.out.println("-------------------------------");

     Set set = hashmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {            
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key is:" +entry.getKey()+"& Value is:");
            System.out.println(entry.getValue());
        }
    }
}

