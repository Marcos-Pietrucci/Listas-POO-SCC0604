package ex4;
import java.lang.RuntimeException;

public class Ex4 {

    public static void main(String[] args) {
        //Definindo a conta
        ContaCorrente conta = new ContaCorrente();
        
        //Operacoes
        //1
        try {
            conta.setValorLimite(1000f);
            conta.setValorLimite(-5f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        //2
        try {        
            conta.depositar(-5f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        //3
        try {        
            conta.depositar(0f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        //4
        try {        
            conta.depositar(500f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        //5
        try {        
            conta.sacar(2000f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        //6
        try {        
            conta.sacar(1200f);
        }
        catch(RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        //Imprimir dados
        conta.imprimeDados();
    }
    
}
