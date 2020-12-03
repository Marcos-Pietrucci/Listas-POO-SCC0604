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
public class Producer implements Runnable {
    
    String name;
    Deposit<Integer> deposit;
    int toProduce;
    
    Producer(String pName,Deposit<Integer> pDeposit, int pToProduce)
    {
        this.name = pName;
        this.deposit = pDeposit;
        this.toProduce = pToProduce;
    }
    
    @Override
    public void run()
    {
        for(int i = 0; i < toProduce; i++) deposit.receive(name, i);
        deposit.close();
    }
    
 
}
