/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author brcol
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackOverflow teste = new StackOverflow();
        
        try {
            teste.a();
        }
        catch(StackOverflowError e) {
            System.out.println("Erro na pilha: função a(), que chama b(), que chama a().");
        }
        
        try {
            teste.c();
        }
        catch(StackOverflowError e) {
            System.out.println("Erro na pilha: função c() que chama a si mesma.");
        }
    }
    
    
    
}
