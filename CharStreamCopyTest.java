/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CharStreamCopyTest {
    //NO CORRE?
    //https://issuu.com/victor_grinyak/docs/lesson_9._java_io_fundamentals

    public static void main(String[] args) {
        char[] c = new char[128];

       // int cLen = c.length; 
        try (FileReader fr = new FileReader(args[0]);
                FileWriter fw = new FileWriter(args[1])) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
               
                    fw.write(c);
                
                count += read;
            }
            System.out.println("Wrote: " + count + " characters.");
        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
