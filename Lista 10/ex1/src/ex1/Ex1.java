/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author montanari
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deposit<Integer> depo = new Deposit("Deposito de bebidas",10);
        int toProduce = 10;
        int topConsumer = 0;
        String[] names = {"Vinicius","Bruno","Marcos"};
        Thread producer = new Thread(new Producer("Fábrica de refrigerantes", depo, toProduce));
        Consumer[] consumers = new Consumer[names.length];
        Thread[] tConsumers = new Thread[names.length];
        
        
        depo.open();
        
        for(int i=0;i < names.length;i++)
        {
            consumers[i] = new Consumer(names[i],depo);
            tConsumers[i] = new Thread(consumers[i]);  
        }
        
        
        producer.start();
        for(int i=0;i<names.length;i++)
            tConsumers[i].start();
        try{
            producer.join();
            for(int i=0; i < names.length;i++)
                tConsumers[i].join();
            
        } catch (InterruptedException e) {
            System.out.println("Erro!! :" + e.getMessage());
        }
        
        for(int i=0;i<names.length;i++)
            System.out.println("O consumidor '" + names[i] + "' consumiu " + consumers[i].getConsumed() + " produtos do '" + consumers[i].getDeposit().name + "'");
        
        for(int i=1;i<names.length;i++)
            if(consumers[i].getConsumed() > consumers[topConsumer].getConsumed())
                topConsumer = i;
        
        
        System.out.println("O maior consumidor foi '" + names[topConsumer] + 
                "', que consumiu " + consumers[topConsumer].getConsumed() + " produtos");
       
    }
    
}
