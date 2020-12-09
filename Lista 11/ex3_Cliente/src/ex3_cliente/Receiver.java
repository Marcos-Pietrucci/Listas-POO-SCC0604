/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author montanari
 */
public class Receiver implements Runnable{
    
    Client cl;
    BufferedReader reader;
    Thread th;
    
    Receiver(Client pClient)
    {
        try{
            cl = pClient;
            th = new Thread(this,"Receiver");
            reader = new BufferedReader(
                        new InputStreamReader(
                            cl.getSocket().getInputStream()));
            startThread();
        }catch(IOException e){
            System.out.println("->Erro: " + e.getMessage());
        }
    }
    
    private void startThread()
    {
        th.start();
    }
    
    @Override
    public void run()
    {
        try {
            String s = "";
            while(true)
            {   
                s = reader.readLine();
                System.out.println("Servidor: " + s);
                if(s.compareTo("Exit") == 0) 
                {
                    System.out.println("->Servidor fechando...");
                    break;
                }
                if(s.compareTo("Cambio") == 0) cl.switchState();
            }
            cl.close();
        }catch (IOException e) {
            System.out.println("Erro run: " + e.getMessage());
            System.exit(-1);
        }
    }
    
    
}
