/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author montanari
 */

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;
    private int items;
    private int size;
    
    Stack()
    {
        data = new ArrayList<>();
        size = 0;
        items = -1;
    }
    
    public void setSize(int pSize)
    {
        size = pSize;
    }
    
    public void clear()
    {
        data.clear();
        items = -1;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void push(String elem) throws Stack_Full {
        if(size == items + 1)
            throw new Stack_Full("A pilha está cheia!!");
        items++;
        data.add(elem);
    }
    
    public String pop() throws Stack_Empty {
        if(items == -1)
            throw new Stack_Empty("Pilha vazia");
        items--;
        return data.remove(items+1);
        
    }
    
}
