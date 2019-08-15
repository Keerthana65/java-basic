/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Keerthana
 */
public class BasicFileIO {

    public static void main(String[] args) {
        File file = new File("file.txt");

        // Write the file
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Keerthi");
            output.println(22);
            output.close();
        } catch (IOException ex) {
            System.out.printf("ERROR: %s/n", ex);
        }

        //Read the file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.printf("Name: %s Age: %d\n", name, age);
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s/n", ex);
        }
    }
}
