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
//Textual Representation how an object will look like in the memory
//Whatever we write in class is in actual the property of object as we are describing the object
//If you want anything which should belong to class make it static !!
class Product{
    //Attributes
    int pid;
    String name;
    int price;
    
    //Constructor

    public Product() {
        System.out.println("Product Object Construted");
    }
    
    //Methods(Behaviour)
    //To write data in Product Object we have this Method
    void setProductDetails(int pid, String name, int  price){
        this.pid=pid;
        this.name=name;
        this.price=price; 
    }
    
    //To read data from Product Object
    void showProductDetails(){
        System.out.println("-----Product ID: "+pid+"-----");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("-----------------------------");
    }
}

class Mobile extends Product{ //IS-A Relation, Mobile IS-A Product, Mobile is Child, Product is Parent

    public Mobile() {
        System.out.println("Mobile Object Constructed");
    }
    
}


public class Inheritance {
    //main is executed by JVM when my program will run!!
    public static void main(String[] args) {
        //Create an Object: Product
        Product product = new Product();
        //Product is not an object its a reference variable which holds the hashcode of the object in hexadecimal notation
        System.out.println("Product is:"+product); // we get 15db9742 as a hashcode, so product is a ref var not an object
        
        //Writing data in Object
        product.setProductDetails(100,"iPhoneX", 70000);
        
        //Reading data from Object
        product.showProductDetails();
        
        //Requseting to get Mobile Object Constructor
        Mobile mobile = new  Mobile();
        //Product Object get contructed before the Mobile Object --> (Run to Inheritence- Object to Object)
        
        mobile.setProductDetails(300, "iPhoneX", 70000);
        mobile.showProductDetails();
    }
}
