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
public abstract class Predio implements PegadaDeCarbono {
    
    private String nomePredio; //Nome do prédio
    private int numPessoas; //Quantidade de pessoas que frequentam o prédio
    private float consumoEnergia; //Consumo de energia no prédio
    private float fator; /*Fator da quantidade de carbono equivalente por kWh 
                         (kgCO2e/kWh)*/
    
    public Predio(String nome, int habitantes, float numConsumoEnergia, float numFator)
    {
        nomePredio = nome;
        numPessoas = habitantes;
        consumoEnergia = numConsumoEnergia;
        fator = numFator;
    }
    
    //Fator default
    public Predio(String nome, int habitantes, float numConsumoEnergia)
    {
        nomePredio = nome;
        numPessoas = habitantes;
        consumoEnergia = numConsumoEnergia;
        fator = 0.295f;
    }
    
    @Override
    public String getNomeStr(){
        return "Edificio '" + nomePredio + "'";
    }
    
    public String getNome()
    {
        return nomePredio;
    }
    
    public int getNumPessoas()
    {
        return numPessoas;
    }
    
    public float getConsumoEnergia()
    {
        return consumoEnergia;
    }
    
    public float getFator()
    {
        return fator;
    }
    
    public void setNomePredio(String nome)
    {
        nomePredio = nome;
    }
    
    public void setPessoas(int numero)
    {
        numPessoas = numero;
    }
    
    public void setConsumoEnergia(int numConsumo)
    {
        consumoEnergia = numConsumo;
    }
        
    public void setFator(int numFator)
    {
        fator = numFator;
    }

    @Override
    public float getPegadaDeCarbono()
    {
        return fator*consumoEnergia;
    }
    
    public float getMediaPegadaDeCarbonoIndividual()
    {
        return getPegadaDeCarbono()/numPessoas;
    }
    
}
