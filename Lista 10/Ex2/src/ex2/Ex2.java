/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 * A ideia do programa é que, após uma thread modificar uma conta, seu saldo final
 * fique igual a 25000. Como teremos 2 operações sobre uma mesma conta, o saldo 
 * FINAL deve ser de 50000 (o que só ocorre com o uso do SYNCHRONIZED).
 * @author brcol
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando conta SEM SYNCHRONIZED e suas threads
        ContaBancariaA ca = new ContaBancariaA();
        Thread ta1 = new Thread(new UsaContaA(ca));
        Thread ta2 = new Thread(new UsaContaA(ca));
        
        //Criando conta COM SYNCHRONIZED e suas threads
        ContaBancariaB cb = new ContaBancariaB();
        Thread tb1 = new Thread(new UsaContaB(cb));
        Thread tb2 = new Thread(new UsaContaB(cb));
        
        //Rodando o programa
        ta1.start();
        ta2.start();
        tb1.start();
        tb2.start();
        
        try{
            //Fazendo com que os processos terminem antes da main
            ta1.join();
            ta2.join();
            tb1.join();
            tb2.join();
            
        }catch(InterruptedException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        
        //Imprime os resultados
        System.out.println("Saldo final conta SEM SYNCHRONIZED: " + ca.getSaldo());
        System.out.println("Saldo final conta COM SYNCHRONIZED: " + cb.getSaldo());
        
        System.out.println("Fim do programa");
    }
}
