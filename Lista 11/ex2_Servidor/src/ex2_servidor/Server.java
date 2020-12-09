/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author montanari
 */
public class Server implements Runnable{
    
    ServerSocket sSocket;
    List<ClientHandler> clients;
    Sender sender;
    Thread th;
    boolean open; 
    
    Server()
    {
        try{
            sSocket = new ServerSocket(8008);
            th = new Thread(this);
            open = true;
            clients = Collections.synchronizedList(new ArrayList<>());
            sender = new Sender(this,clients);
            startThread();
        }catch(IOException e){
            System.out.println("->ERRO!:" + e.getMessage());
        }
        System.out.println("->Servidor aberto!");
        System.out.println("->(Digite Exit caso queira fechar o servidor)");
    }
    
    private void startThread()
    {
        th.start();
    }
    
    public void close()
    {
        System.out.println("->Servidor fechando...");
        sender.sendAll("Exit");
        System.exit(0);
    }
    
    public void remove(ClientHandler client)
    {
        System.out.println("->" + client.getName() + " foi desconectado...");
        clients.remove(client);
        sender.send("Você foi desconectado", client);
        sender.send("Exit", client);
    }
    
    public void accept(ClientHandler client)
    {
        sender.send("Bem vindo " + client.getName(), client);
    }
    
    @Override
    public void run()
    {
        int id = 0;
        try{
            while(open)
            {
                Socket clientSoc = sSocket.accept();
                clients.add(new ClientHandler(clientSoc,this,id));
                id++;
            }
        }catch(IOException e){
            System.out.println("->ERRO!:" + e.getMessage());
        }
    }
    
}
