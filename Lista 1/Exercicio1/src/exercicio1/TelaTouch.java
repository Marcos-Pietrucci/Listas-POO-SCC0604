/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;
import java.util.Scanner;

/**
 *
 * @author brcol
 */
public class TelaTouch {
    private float luminosidade; //luminosidade vai de 0 a 100
    
    TelaTouch() {
        luminosidade = 50;
    }
    
    public void mostrar(String texto) {
        System.out.println(texto);
    }
    
    public String ler() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    
    public float getLuminosidade() {
        return luminosidade;
    }
    
    public void aumentarLuz(float pValor) {
        if(luminosidade + pValor < 100) {
            luminosidade += pValor;
            reajustarLuz();
        }
    }
    
    public void diminuirLuz(float pValor) {
        if(luminosidade - pValor > 0)
            luminosidade -= pValor;
    }
    
    private void reajustarLuz() {
        if(luminosidade > 80)
        {
            mostrar("Esse nivel de luminosidade pode ser prejudicial para a visao.");
            mostrar("Deseja continiuar? (S/N)");
            String resposta = ler(); //variavel auxiliar
            if(resposta.equals("N"))
               luminosidade = 80; //valor maximo "recomendavel" de luminosidade
        }
    }
}
