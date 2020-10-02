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
public class Casa extends Predio{
    
    public enum tipo {geminada,apartamento,murada}
    private tipo tipoCasa; //Número da casa
 
    public Casa(String nome, int habitantes, tipo pTipoCasa, float numConsumoEnergia, float numFator)
    {
        super(nome,habitantes,numConsumoEnergia,numFator);
        tipoCasa = pTipoCasa;
    }
    
    public Casa(String nome, int habitantes, tipo pTipoCasa, float numConsumoEnergia)
    {
        super(nome,habitantes,numConsumoEnergia);
        tipoCasa = pTipoCasa;
    }
    
    public tipo getGeminada()
    {
        return tipoCasa;
    }
    
    @Override
    public String getNomeStr(){
        return "Casa '" + getNome() + "'";
    }  
   
}
