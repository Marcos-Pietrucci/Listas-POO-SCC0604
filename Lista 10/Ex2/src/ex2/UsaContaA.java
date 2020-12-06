package ex2;

/**
 * Classe que manipula uma conta bancaria SEM SYNCHRONIZED.
 * @author brcol
 */
public class UsaContaA implements Runnable{
    
    ContaBancariaA ca;
    
    public UsaContaA(ContaBancariaA ca){
        this.ca = ca;
    }
    
    @Override
    public void run(){
        int i;
        
        //Depositos
        for(i = 0; i < 5000; i++){
            ca.deposita(10);
        }
        
        //O saldo da conta fica, teoricamente, igual a 50000.
        
        //Saques
        for(i = 0; i < 5000; i++){
            ca.saca(5);
        }
        
        //O saldo da conta fica no FINAL, teoricamente, 25000 reais maior do que
        //o inicial (que é, por padrão, zero(0)).
    }
}
