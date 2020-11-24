/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Vinícius Montanari
 */


public class Ex4 {
    
    public static void writeName()
    {
        String name = "Vinícius"; 
        byte[] array = name.getBytes();

        try{
            FileOutputStream stream = new FileOutputStream("nome.txt");
            stream.write(array);
        }catch (IOException e){
            System.out.println("ERRO!:" + e.getMessage() );
        }
        
    }
    
    public static void main(String[] args) {

        
        writeName();
      
        
    }
    
}
