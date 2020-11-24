/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author marco
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileReader file;
        LineNumberReader line_reader;
        
        try{
            
            // Este arquivo não possui 10 linhas
            //file = new FileReader(new File("file2.txt")); 
            
            // Este arquivo possui mais de 10 linhas
            file = new FileReader(new File("file.txt"));
            
            //Instancia o line reader
            line_reader = new LineNumberReader(file);
            
            //Inicia a leitura do arquivo
            String linha = "Temos: \n";
            int num = 1;
            
            while(linha != null)
            {
                System.out.print(linha);
                linha = line_reader.readLine();
                if(num == 10)
                    System.out.println(" ----> !!CHEGOU NA LINHA 10!!");
                else
                    System.out.print("\n");
                        
                num = line_reader.getLineNumber(); //retorna "null" caso esteja no fim do arquivo
            }
            
            line_reader.close();
            file.close();
            
            if(num < 10)
                System.out.println("!!Infelizmente o arquivo não tem 10 linhas!!");
            
        }
        catch(IOException e)
        {
            System.out.println("Erro " + e.getMessage());
        }        
    }  
}
