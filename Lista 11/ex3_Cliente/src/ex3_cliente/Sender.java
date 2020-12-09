/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author montanari
 */
public class Sender implements Runnable{
    
    Client cl;
    PrintWriter pw;
    BufferedReader input;
    Thread th;
    
    
    Sender(Client pClient)
    {
        try{
            cl = pClient;
            pw = new PrintWriter(new OutputStreamWriter( 
                                    cl.getSocket().getOutputStream()));
            input = new BufferedReader(new InputStreamReader(System.in));
            th = new Thread(this, "Sender");
            startThread();
        }catch(IOException e){
            System.out.println("->Erro: " + e.getMessage());
        }
    }
    
    private void startThread()
    {
        th.start();
    }
    
    public void send(String msg)
    {
        if(cl.getSend() || msg.compareTo("Exit") == 0){
            pw.println(msg);
            pw.flush();
        }
    }
    
    @Override
    public void run()
    {
        try {
            String s = "";
            while(true)
            {
                s = input.readLine();
                if(s.compareTo("Exit") == 0) cl.close();
                if(cl.getSend()){
                    send(s);
                    if(s.compareTo("Cambio") == 0) cl.switchState();
                }
            }
            
            
        }catch (IOException e) {
            System.out.println("->Erro: " + e.getMessage());
            System.exit(-1);
        }
    }
    
    
}
