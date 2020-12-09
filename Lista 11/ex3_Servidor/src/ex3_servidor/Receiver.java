/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_servidor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author montanari
 */
public class Receiver implements Runnable{
    
    Server serv;
    ClientHandler client;
    BufferedReader reader;
    Thread th;
    
    
    Receiver(Server pServer, ClientHandler pClient)
    {
        serv = pServer;
        client = pClient;
        try{
            reader = new BufferedReader(
                            new InputStreamReader(
                                client.getSocket().getInputStream()));
        }catch(IOException e){
            System.out.println("->ERRO!:" + e.getMessage());
        }
        th = new Thread(this);
        startThread();
    }
    
    private void startThread()
    {
        th.start();
    }
    
    public void readAll()
    {
        
    }
    
    @Override
    public void run()
    {
        
        String s = "";
        while(true)
        {   
            try{
                s = reader.readLine();
            } catch (IOException x){
                System.out.println("->ERRO!:" + x.getMessage());
            } 

            System.out.println(client.getName() + ": " + s);

            if(!client.isAuth()){
                if(s.compareTo("POO") == 0) 
                {
                    serv.accept(client);
                 }else{
                    serv.refuse(client);
                    break;
                }
            }
            if(s.compareTo("Exit") == 0){
                break;
            }

            if(s.compareTo("Cambio") == 0) client.switchSend();
        }
        
        serv.remove(client);
    }
    
    
}
