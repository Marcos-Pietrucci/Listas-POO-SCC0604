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
public class Consumer implements Runnable {
    String name;
    Deposit<Integer> deposit;
    int consumed;
    
    Consumer(String pName, Deposit<Integer> pDeposit)
    {
        this.name = pName;
        this.deposit = pDeposit;
        consumed = 0;
    }
    
    @Override
    public void run()
    {
        Integer product;
        
        while(!deposit.isClosed())
        {
            product = deposit.send(name);
            if(product!= null)
                consumed++;
        }
             
    }
    
    public Deposit<Integer> getDeposit()
    {
        return deposit;
    }
    
    public int getConsumed()
    {
        return consumed;
    }
    
}
