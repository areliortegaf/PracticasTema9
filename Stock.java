/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author asortega
 */
public class Stock implements Serializable {
    private static final long SerialVersionUID = 100L;
    private String symbol;
    private int shares;
    private double purchasePrice;
    //una variable de instancia es marcada como "transient" para indicarle a la jvm que se salete una variable al serializar
    //la variable no sera persistente
    private transient double currPrice;
    
    public Stock (String symbol, int shares, double purchasePrice){
        this.symbol = symbol;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
        
        //AQUI SE INICIALIZAN OTRAS ACTIVIDADES
        
        //setStockPrice();  -- METODO DEL EJEMPLO QUE NO TENGO
    }
    
    //A ESTE METODO SE LE LLAMA POST SERIALIZACION
    private void readObject (ObjectInputStream ola) throws ClassNotFoundException, IOException{
        ola.defaultReadObject();
        
        //AQUI SE INICIALIZAN OTRAS ACTIVIDADES
        
        //setStockPrince();
    }
}
