/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_cliente;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author montanari
 */
public class Client implements Runnable{
    
    Socket cSocket; 
    Sender sender;
    Receiver receiver;
    boolean isSending;
    
    Client()
    {
        try{
            cSocket = new Socket("localhost",8008);
            sender = new Sender(this);
            receiver = new Receiver(this);
            isSending = true;
        }catch(IOException e ){
            System.out.println("->Erro: " + e.getMessage());
            System.exit(-1);
        }
        System.out.println("->Cliente conectado");
        System.out.println("->(Digite Exit caso queira se desconectar)");
        getControlStatus();
    }
    
    public void switchState(){
       isSending = !isSending;
       System.out.println("->Cambio efetuado");
       getControlStatus();
    }
    
    public final void getControlStatus()
    {
        if(isSending)
        {
            System.out.println("->Cliente tem o controle");
        }else{
            System.out.println("->Servidor tem o controle");
        }
    }
    
    public Socket getSocket()
    {
        return cSocket;
    }
    
    public boolean getSend()
    {
        return isSending;
    }
    
    public void close()
    {
        System.out.println("->Cliente desconectando...");
        sender.send("Exit");
        System.exit(0);
    }
    
    @Override
    public void run()
    {

    }
    
}
