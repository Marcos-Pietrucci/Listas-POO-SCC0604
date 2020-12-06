package ex2;

/**
 * Conta bancaria COM O USO DE SYNCHRONIZED.
 * @author brcol
 */
public class ContaBancariaB {
    
    private int saldo;
    
    public ContaBancariaB(){
        saldo = 0;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    synchronized public void deposita(int valor){
        int temp;
        
        temp = saldo + valor;
        saldo = temp;
    }
    
    synchronized public void saca(int valor){
        int temp;
        
        temp = saldo - valor;
        saldo = temp;
    }
}
