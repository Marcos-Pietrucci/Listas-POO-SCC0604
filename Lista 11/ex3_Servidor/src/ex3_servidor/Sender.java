/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author montanari
 */
public class Sender implements Runnable{
    
    Server serv;
    List<ClientHandler> clients;
    BufferedReader input;
    Thread th;
    
    Sender(Server pServer, List<ClientHandler> pClient)
    {
        serv = pServer;
        clients = pClient;
        input = new BufferedReader(new InputStreamReader(System.in));
        th = new Thread(this);
        startThread();
    }
    
    private void startThread(){
        th.start();
    }
    
    public void sendAll(String msg)
    {
        for(ClientHandler client : clients)
        {
            if(client.isSending || msg.compareTo("Exit") == 0){
                client.getSender().println(msg);
                client.getSender().flush();
                if(msg.compareTo("Cambio") == 0) client.switchSend();
            }
        }
        if(msg.compareTo("Exit") != 0 && clients.isEmpty()){
            System.out.println("->Não há clientes conectados!");
        }
    }
    
    public void send(String msg, ClientHandler client)
    {
        client.getSender().println(msg);
        client.getSender().flush();
        if(msg.compareTo("Cambio") == 0) client.switchSend();
    }
    
    @Override
    public void run()
    {
        String s = "";
        try{
        while(true)
        {
            s = input.readLine();
            if(s.compareTo("Exit") == 0) serv.close();
            sendAll(s);
        }
        }catch (IOException e) {
            System.out.println("->ERRO!:" + e.getMessage());
        }
    }
}
