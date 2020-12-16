package ex4_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Ex4_java {
    
    //Imprime os valores
    public static void imprime(Iterator<Double> it)
    {
        double aux;
        while(it.hasNext())
        {
            aux = it.next();
            System.out.print(" " + aux);
        }
    }
    
    //Acessa metade dos valores
    public static void getMetade(Iterator<Double> it, long num)
    {
        double aux;
        int i;
        for(i = 0; i < num ; i++)
        {
            aux = it.next();
        }
    }
   
    //Libera o elemento
    public static void removeTudo(Iterator<Double> it)
    {
        Iterator<Double> aux;
        while(it.hasNext())
        {
            it.next();
            aux = it;
            it.remove();
            it = aux;
        }
    }
    
    
    public static void main(String[] args) {
        
        //Testaremos os seguintes
        ArrayList<Double> arList = new ArrayList<>();
        LinkedList<Double> linList = new LinkedList<>();
        ArrayDeque<Double> arDeq = new ArrayDeque<>();
       
        
        long tempo = System.currentTimeMillis();
        long num = 1000000;
        long i;
        
        //Adicionando varios numeros ao ArrayList
        for(i = 0; i < num; i++)
        {
            arList.add(Math.random()*10); 
        }
        
        //Realizar as operações pedidas para o ArrayList
        imprime(arList.iterator());
        getMetade(arList.iterator(), num/2);
        removeTudo(arList.iterator());
        
        System.out.println("\nArrayList demorou: " + (System.currentTimeMillis() - tempo));
        tempo = System.currentTimeMillis();
        
        /**********************************************************************/
        
        //Adicionando varios numeros ao LinkedList
        for(i = 0; i < num; i++)
        {
            linList.add(Math.random()*10); 
        }
        
        //Realizar as operações pedidas para o LinkedList
        imprime(linList.iterator());
        getMetade(linList.iterator(), num/2);
        removeTudo(linList.iterator());
        
        System.out.println("\nLinkedList demorou: " + (System.currentTimeMillis() - tempo));
        tempo = System.currentTimeMillis();
        
        /**********************************************************************/
        
        //Adicionando varios numeros ao ArrayDeque
        for(i = 0; i < num; i++)
        {
            arDeq.add(Math.random()*10); 
        }
        
        //Realizar as operações pedidas para o ArrayDeque
        imprime(arDeq.iterator());
        getMetade(arDeq.iterator(), num/2);
        removeTudo(arDeq.iterator());
        
        System.out.println("\nArrayDeque demorou: " + (System.currentTimeMillis() - tempo));        
    }
    
}
