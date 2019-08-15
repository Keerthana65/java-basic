/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Keerthana
 */
public class FileHandling {

    public static void main(String[] args) {
        //File Output Stream
  /*      try {
            FileOutputStream fout = new FileOutputStream("D:File.txt");
            String s = "I'm Keerthana";
            
            byte b[] = s.getBytes();
            fout.write(b);
            
            fout.close();
            System.out.println("Success!!!");
        } catch (Exception e) {
            System.out.println(e);
        }*/

          //File Input Stream
        try {
            FileInputStream fin = new FileInputStream("D:File.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.print(e);

        }

    }
}
