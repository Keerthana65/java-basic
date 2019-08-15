/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author Keerthana
 */
public class UsingLoop {
    public static void main(String[] args) {
        int maths, physics, chemistry, english, computerscience, studentNo;
        double finalscore;
        boolean results;

        Scanner marks = new  Scanner(System.in);
        System.out.println("Number of Students:");
        studentNo = marks.nextInt();
        
        //USING FOR LOOP
        for(int i=0; i<studentNo; i++){
             System.out.println("Enter the Maths Marks:");
            maths = marks.nextInt();
            
            System.out.println("Enter the Physics Marks:");
            physics = marks.nextInt();
            
            System.out.println("Enter the Chemistry Marks:");
            chemistry = marks.nextInt();
            
            System.out.println("Enter the English Marks:");
            english = marks.nextInt();
            
            System.out.println("Enter the ComputerScience Marks:");
            computerscience = marks.nextInt();
            
            finalscore=(maths+physics+chemistry+english+computerscience)/5;
            
            if(finalscore>90){
                System.out.println("Excellent");
            }else if(finalscore>80){
                System.out.println("Very Good");
            }else if(finalscore>60){
                System.out.println("Good");
            }else if(finalscore>40){
                System.out.println("Average");
            }else{
                System.out.println("Poor");
            }
            
            System.out.println("Any more Students(true or false)");
            
            results = marks.nextBoolean();
        }
        
        // USING DO-WHILE LOOP & IF-ELSE STATEMENT
        do{
            System.out.println("Enter the Maths Marks:");
            maths = marks.nextInt();
            
            System.out.println("Enter the Physics Marks:");
            physics = marks.nextInt();
            
            System.out.println("Enter the Chemistry Marks:");
            chemistry = marks.nextInt();
            
            System.out.println("Enter the English Marks:");
            english = marks.nextInt();
            
            System.out.println("Enter the ComputerScience Marks:");
            computerscience = marks.nextInt();
            
            finalscore=(maths+physics+chemistry+english+computerscience)/5;
            
            if(finalscore>90){
                System.out.println("Excellent");
            }else if(finalscore>80){
                System.out.println("Very Good");
            }else if(finalscore>60){
                System.out.println("Good");
            }else if(finalscore>40){
                System.out.println("Average");
            }else{
                System.out.println("Poor");
            }
            
            System.out.println("Any more Students(true or false)");
            
            results = marks.nextBoolean();
        }while(results);
    }
}
