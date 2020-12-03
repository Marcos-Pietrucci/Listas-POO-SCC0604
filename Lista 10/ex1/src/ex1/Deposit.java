/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Stack;

/**
 *
 * @author montanari
 * @param<T>
 */


public class Deposit<T> extends Stack<T>{
    
    String name;
    boolean closed;
    int size;
    
    Deposit(String pName, int pSize)
    {
        this.name = pName;
        closed = true;
        this.size = pSize;
    }
    
    synchronized void open()
    {
        System.out.println("Deposito '" + name + "' aberto!");
        closed = false;
    }
    
    synchronized void close(){
        System.out.println("Deposito '" + name + "' fechado!");
        closed = true;
    }
    
    public boolean isClosed()
    {
        return closed;
    }

    synchronized void receive(String pName, T product)
    {
        try{
            while(size() == size)
                wait();
        }catch (InterruptedException e){
            System.out.println("Erro!! :" + e.getMessage());
        }
        
        push(product);
        System.out.println("Deposito '" + name + "' recebeu produto do produtor '" + pName + "'");
        notifyAll();
    }
    
    synchronized T send(String consumer){
        try{
            while(isEmpty() && !isClosed())
                wait();
        }catch (InterruptedException e){
            System.out.println("Erro!! :" + e.getMessage());
        }
        
        if(isClosed())
            return null;
        
        T product = pop();
        notifyAll();
        return product;
    }
}
