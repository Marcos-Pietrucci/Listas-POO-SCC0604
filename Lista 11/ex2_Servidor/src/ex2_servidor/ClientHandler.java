/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_servidor;

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

    ClientHandler(Socket pSoc, Server pServer, int id)
    {
        try{
            clientSoc = pSoc;
            sender = new PrintWriter(new OutputStreamWriter( 
                                    clientSoc.getOutputStream()));
            server = pServer;
            receiver = new Receiver(server,this);
            name = "Cliente " + id;
        }catch(IOException e){
            System.out.println("->ERRO!:" + e.getMessage());
        }
        System.out.println("->" + name + " foi conectado!");
        waiting();
    }
    
    public String getName()
    {
        return name;
    }
    
    public Socket getSocket()
    {
        return clientSoc;
    }
  
    private void waiting()
    {
        //Não tem autenticação 
        server.accept(this);
    }
    
    public PrintWriter getSender()
    {
        return sender;
    }
    
}
