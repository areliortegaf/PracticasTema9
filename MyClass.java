/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author asortega
 */
public class MyClass implements Serializable{
    //Metodo para serializar objectos
    public void writeObject (ObjectOutputStream o) throws IOException {
        o.defaultWriteObject();
        //escribe y guarda campos adicionales
        o.writeObject(new java.util.Date());
    }
    
}
