/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.LinkedList;

/**
 *
 * @author Keerthana
 */
public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("abc");
        list.add("pqr");
        list.add("xyz");
        list.add("stu");
        list.addFirst("keerthi");
        list.addLast("rammiya");
        
        System.out.println("List Size:"+list.size());
        
        for(String x:list){
            System.out.println(x);
        }
    }
}
