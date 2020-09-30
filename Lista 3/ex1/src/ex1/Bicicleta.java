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
public class Bicicleta extends Veiculo {
    
    private final String porte;
    
    Bicicleta(String marca, String modelo, int ano, double valor, String porte)
    {
        super(marca,modelo,ano,valor);
        this.porte = porte;
    }
    
    public void listarVerificacoes()
    {
        System.out.println("Listando as necessidades da bike");
    }
    public void ajustar()
    {   
        System.out.println("Ajustando o guidão e os freios");
    }
    public void limpar()
    {
        System.out.println("Limpando a bike");
    }
    
    public void lubrificar()
    {
        System.out.println("Colocando graxa na corrente dessa "+this.marca+" "+this.modelo+" de porte "+this.porte);
        System.out.println("Printinho!Corrente engraxada!\n");
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

