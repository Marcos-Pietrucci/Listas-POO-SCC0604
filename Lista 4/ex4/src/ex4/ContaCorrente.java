package ex4;

public class ContaCorrente {
    private float saldo;
    private float creditoLimite;
    private float divida; //Se sacou usando o credito, fica com divida
    
    ContaCorrente() {
        saldo = 0.0f;
        creditoLimite = 0.0f;
        divida = 0.0f;
    }
    
    public void setValorLimite(float valor) {
        if(valor < 0)
            throw new RuntimeException("O credito nao pode ser um valor negativo");
        else {
            creditoLimite = valor;
            System.out.println("Valor do credito atualizado para " + creditoLimite + " reais.");
        }
    }
    
    public void sacar(float valor) {
        if(valor > saldo + creditoLimite)
            throw new RuntimeException("[Saldo + credito] insuficiente");
        else {
            if(valor > saldo) {
                divida = valor - saldo;
                saldo = 0;
                System.out.println("Voce usou o credito para fazer o saque.");
                System.out.println("Voce fez uma divida de " + divida + " reais.");
            }
            else {
                saldo -= valor;
                System.out.println("Valor de " + valor + " reais sacado da conta.");
                System.out.println("Nova saldo: " + saldo + " reais.");
            }
        }
            
    }
    
    public void depositar(float valor) {
        if(valor == 0)
            throw new RuntimeException("Nao eh permitido depositar 0 reais");
        else if(valor < 0)
            throw new RuntimeException("Nao eh permitido depositar valor negativo");
        else {
            saldo += valor;
            System.out.println("Valor de " + valor + " reais depositado na conta.");
            System.out.println("Nova saldo: " + saldo + " reais.");
        }
    }
    
    public void imprimeDados() {
        System.out.println("Saldo = " + saldo + " reais.");
        System.out.println("Credito = " + creditoLimite + " reais.");
        System.out.println("Divida = " + divida + " reais.");
    }
}