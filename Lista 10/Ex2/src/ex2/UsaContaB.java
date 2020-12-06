/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 * Classe que manipula uma conta bancaria COM SYNCHRONIZED.
 * @author brcol
 */
public class UsaContaB implements Runnable{
 
    ContaBancariaB cb;
    
    public UsaContaB(ContaBancariaB cb){
        this.cb = cb;
    }
    
    @Override
    public void run(){
        int i;
        
        //Depositos
        for(i = 0; i < 5000; i++){
            cb.deposita(10);
        }
        
        //O saldo da conta fica, teoricamente, igual a 50000.
        
        //Saques
        for(i = 0; i < 5000; i++){
            cb.saca(5);
        }
        
        //O saldo da conta fica no FINAL, teoricamente, 25000 reais maior do que
        //o inicial (que é, por padrão, zero(0)).
    }
}
