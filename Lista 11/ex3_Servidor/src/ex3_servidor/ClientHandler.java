/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author montanari
 */
public class ClientHandler{
    
    Socket clientSoc;
    Receiver receiver;
    PrintWriter sender;
    Server server;
    String name;
    boolean isSending;
    boolean isAut;

    ClientHandler(Socket pSoc, Server pServer, int id)
    {
        try{
            clientSoc = pSoc;
            sender = new PrintWriter(new OutputStreamWriter( 
                                    clientSoc.getOutputStream()));
            server = pServer;
            receiver = new Receiver(server,this);
            isSending = false;
            isAut = false;
            name = "Cliente " + id;
            waiting();
            System.out.println("->" + name + " foi conectado!");
            getControlStatus();
        }catch(IOException e){
            System.out.println("->ERRO!:" + e.getMessage());
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public Socket getSocket()
    {
        return clientSoc;
    }
    
    public boolean isAuth()
    {
        return isAut;
    }
   
    public void setAuth(boolean state)
    {
        isAut = state;
    }
    
    public void switchSend()
    {
        System.out.println("->Cambio efetuado para " + name);
        isSending = !isSending;
        getControlStatus();
    }
    
    public final void getControlStatus()
    {
        if(isSending)
        {
            System.out.println("->Servidor tem o controle");
        }else{
            System.out.println("->" + name + " tem o controle");
        }
    }
    
    public boolean getSend()
    {
        return isSending;
    }
    
    public PrintWriter getSender()
    {
        return sender;
    }
    
    private void waiting()
    {
        server.waitingAuth(this);
    }
    
}
