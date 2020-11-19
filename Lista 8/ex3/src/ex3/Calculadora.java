/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author brcol
 */
public class Calculadora {
    
    public Calculadora() {
    }
    
    public int soma(int x, int y) {
        return (x + y);
    }
    
    public int subtracao(int x, int y) {
        return (x - y);
    }
    
    public int multiplicacao(int x, int y) {
        return (x * y);
    }
    
    public double divisao(int x, int y) {
        //Divisão por 0 (zero) -> Exceção
        if(y == 0) {
            throw new java.lang.ArithmeticException("Divisão por zero");
        }
        //Divisão normal
        else {
            return ((double)x / (double) y);
        }
    }
}
