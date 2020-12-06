package ex2;

/**
 * Conta bancaria SEM O USO DE SYNCHRONIZED.
 * @author brcol
 */
public class ContaBancariaA {
    
    private int saldo;
    
    public ContaBancariaA(){
        saldo = 0;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void deposita(int valor){
        int temp;
        
        temp = saldo + valor;
        saldo = temp;
    }
    
    public void saca(int valor){
        int temp;
        
        temp = saldo - valor;
        saldo = temp;
    }
    
}
