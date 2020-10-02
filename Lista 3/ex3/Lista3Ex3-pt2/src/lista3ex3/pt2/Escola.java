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
public class Escola extends Predio{
    
    public enum tipo {publica,privada}
    
    private final tipo tipoEscola;
    
    public Escola(String nome, int habitantes, tipo pTipoEscola, float numConsumoEnergia, float numFator)
    {
        super(nome,habitantes,numConsumoEnergia,numFator);
        tipoEscola = pTipoEscola;
    }
    
    public Escola(String nome, int habitantes, tipo pTipoEscola, float numConsumoEnergia)
    {
        super(nome,habitantes,numConsumoEnergia);
        tipoEscola = pTipoEscola;
    }
    
    
    public tipo getTipo()
    {
        return tipoEscola;
    }

    
    @Override
    public String getNomeStr(){
        return "Escola '" + getNome() + "'";
    }  
}
