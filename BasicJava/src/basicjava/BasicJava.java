/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author Keerthana
 */
public class BasicJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DIFFERENT TYPE OF DATA TYPE IN JAVA
        int prodect_id,customer_id;
        double cost,price,discount;
        boolean feedback;
        
        // DATA OPERATION IN JAVA
        int itemA=200, itemB=50, itemC=25;
        double prices;
        
        prices = ((itemA*2)+(itemB)+(itemC*3));
        prices = prices-(.1*prices);
        prices = prices+(.05*prices);
        
        System.out.println("Total Price:"+prices);
        // IF-ELSE STATEMENT
        if(prices>500){
            System.out.println("Congrats you have a 25% Discount coupon");
        }else{
            System.out.println("Thank for you shopping us");
        }
    }
}
    

