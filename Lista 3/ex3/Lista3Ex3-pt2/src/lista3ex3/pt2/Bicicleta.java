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
public class Bicicleta implements PegadaDeCarbono {
    
    private String marca;
    private int aro;
    private String tipo;
    private String cor;
    
    public Bicicleta (String pMarca, int pAro, String pTipo, String pCor)
    {
        marca = pMarca;
        aro = pAro;
        tipo = pTipo;
        cor = pCor;
    }
    
    @Override
    public String getNomeStr()
    {
        return "Bicicleta " + marca + " aro " + aro + " " + cor;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public int getAro()
    {
        return aro;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    @Override
    public float getPegadaDeCarbono(){
        
        
        //Bicicleta não emite carbono
        return 0.0f;
        
        
    }
    
}
