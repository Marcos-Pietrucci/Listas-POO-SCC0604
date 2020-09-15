/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author brcol
 */
public class SistComunicacao {
    private String numBloqueado; //numero de telefone bloqueado pelo usuario
    
    SistComunicacao() {
        numBloqueado = "";
    }
    
    public void fazerChamada(String pNumero) {
        System.out.println("Voce ligou para " + pNumero);
    }
    
    public void receberChamada(String pNumero) {
        if(bloquearChamada(pNumero))
            System.out.println("Voce recebu uma ligacao do numero " + pNumero);
        else
            System.out.println("O numero " + pNumero + " esta bloqueado.");
    }
    
    public void definirBloqueado(String pNumero) {
        numBloqueado = pNumero;
    }
    
    //O seguinte metodo retorna se o numero recebido eh o bloqueado
    private boolean bloquearChamada(String pNumero) {
        if(!pNumero.equals(numBloqueado))
            return true; //as strings sao iguais
        else
            return false; //as strings sao diferentes
    }
}
