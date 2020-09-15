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
public class Processador {
    private boolean ligado;
    private boolean processaDados;
    
    Processador() {
        ligado = false;
        processaDados = false;
    }
    
    private void inicializarProcessos() {
        processaDados = true;
    }
    
    private void encerrarProcessos() {
        processaDados = false;
    }
    
    public void ligar() {
        inicializarProcessos();
        ligado = true; 
    }
    
    public void desligar() {
        encerrarProcessos();
        ligado = false;
    }
}
