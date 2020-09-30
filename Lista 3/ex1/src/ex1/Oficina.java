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
public class Oficina {
    
    private String nome;
    private Veiculo[] espera;
    private int indc = 0;
    private int max = 4;
    
    Oficina(String nome)
    {
        this.nome = nome;
        espera = new Veiculo[10];
        System.out.println("Bem-vindo a oficina "+this.nome);
        this.espera[0] = new Automovel("Fiat", "uno", 2003, 8000, 110, "JDK01011", "Gasolina");
        this.espera[1] = new Automovel("Gurgel", "XEF", 1992, 10000, 90, "UML1123", "Gasolina");
        this.espera[2] = new Bicicleta("Oxer", "KSL 21", 2019, 1300, "Adulto");
        this.espera[3] = new Bicicleta("Caloi", "Velox", 2015, 1000, "Adolescente");
        this.espera[4] = new Automovel("Toyota", "Prios", 2016, 85000, 90, "DRG2288", "Eletricidade");
    }
    
    public Veiculo proximo()
    {
        if(indc > max)
        {
            System.out.println("Sem mais carros para revisão!");
            return null;
        }
        else
        {
            return espera[indc];
            //Enquanto o veiculo nao for revisionado, ele deve ficar na fila
        } 
    }
    
    public void novoCliente(Veiculo v)
    {
        System.out.println("Que legal! Um(a) "+v.marca+" "+v.modelo+" será nosso novo cliente\n");
        espera[++max] = v;    
    }
    
    public void manutencao(Veiculo v)
    {
        System.out.println("Vamos deixar esse(a) "+v.getMarca()+" "+v.getModelo()+" ("+v.getAno()+") nos trinques!!");
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        
        if(v instanceof Automovel)
        {
            ((Automovel) v).trocarOleo();
        }
        else
        {
            //É uma bicicleta então
            ((Bicicleta)v).lubrificar();
        }
        System.out.println("");
        indc++;
    }
    
    public int getTamFila()
    {
        return this.max;
    }
    
}
