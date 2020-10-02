/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex3.pt2;

/**
 *
 * @author montanari
 */
public class Carro implements PegadaDeCarbono{
    public enum combustivel {gasolina,diesel}
    private String marca;
    private String modelo;
    private String cor;
    private int ano; 
    private int numPassageiros;
    private float eficiencia; //Eficiencia do motor em Km/L
    private float kmRodados;
    private combustivel tipoCombustivel;
    
    public Carro(String pMarca, String pModelo, String pCor, int pAno, combustivel pTipoCombustivel, int pNumPassageiros, float pEficiencia, float pKmRodados)
    {
        marca = pMarca;
        modelo = pModelo;
        cor = pCor;
        ano = pAno;
        tipoCombustivel = pTipoCombustivel;
        numPassageiros = pNumPassageiros;
        eficiencia = pEficiencia;
        kmRodados = pKmRodados;
    }
    
    @Override
    public String getNomeStr()
    {
        return "Carro " + marca + " " + modelo + " " + ano + " " + cor;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public String getCor()
    {
        return cor;
        
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public int getNumPassageiros()
    {
        return numPassageiros;
    }
    
    public float getEficiencia()
    {
        return eficiencia;
    }
    
    public float getKmRodados()
    {
        return kmRodados;
    }
    
    public void addKm(float kmAdd)
    {
        kmRodados += kmAdd;
    }
    
    public combustivel getTipoCombustivel()
    {
        return tipoCombustivel;
    }
    
    //Considerando apenas carros a gasolina
    @Override
    public float getPegadaDeCarbono(){
        
        /*
        Gasolina:
        consumo em litros * porcentagem aproximada de gasolina *
        densidade da gasolina (0,75 kg/litro) * fator de transformacão da 
        gasolina em carbono (3,7 C/C02)
        
        Fonte: LASTROP - ESALQ - USP
        
        Diesel:
        consumo em litros * porcentagem aproximada de gasolina * fator de transformacão 
        do diesel em carbono (3,7 C/C02)
        */
        
        if(tipoCombustivel == combustivel.gasolina)
            return (1/eficiencia)*kmRodados*0.82f*0.75f*3.7f;
        else
            return (1/eficiencia)*kmRodados*0.83f*3.7f;
       
    }
    
    public float getMediaPegadaDeCarbonoIndividual()
    {
        return getPegadaDeCarbono()/numPassageiros;
    }
    
    
    
    
}
