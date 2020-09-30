/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author marco
 */
public abstract class Veiculo {
   
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valor;
    
    Veiculo(String marca, String modelo, int ano, double valor){
        
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.modelo = modelo;
        
    }
    
    public abstract void listarVerificacoes();
    public abstract void ajustar();
    public abstract void limpar(); 
    public abstract String getMarca(); 
    public abstract String getModelo(); 
    public abstract int getAno(); 
    
}
