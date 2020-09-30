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
public class Automovel extends Veiculo {
    
    private final int velMax;
    private final String placa;
    private final String combustivel;
    
    Automovel(String marca, String modelo, int ano, double valor, int velMax, String placa, String combustivel)
    {
        super(marca,modelo,ano,valor);
        this.velMax = velMax;
        this.placa = placa;
        this.combustivel = combustivel;
    }
    
    public void listarVerificacoes()
    {
        System.out.println("Realizando a listagem: Placa "+this.placa);
    }
    public void ajustar()
    {   
        System.out.println("Ajustando os eixos");
    }
    public void limpar()
    {
        System.out.println("Limpando a carcaça!");
    }
    
    public void trocarOleo()
    {
        System.out.println("Trocando oleo desse possante movido a "+this.combustivel);
        System.out.println("Printinho!Oleo trocado\n");
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public int getAno()
    {
        return this.ano;
    }

}
