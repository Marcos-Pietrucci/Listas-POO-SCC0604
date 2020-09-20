/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Montanari
 */
public class driver {
    
    private final String nomeDispositivo;
    private Boolean ligado;
    
    driver(String pNome)
    {
        nomeDispositivo = pNome;
    }
    
    public String nome()
    {
        return nomeDispositivo;
    }
    
    public void verificaStatus()
    {
        System.out.print("O dispositivo genérico '" + nome() + "'");
        if(estadoEnergia())
            System.out.println(" está ligado");
        else
            System.out.println(" está desligado");
        
    }
    
    public void ligaDispositivo()
    {
        ligado = true;
        System.out.println("Dispositivo ligado");
        verificaStatus();
    }
    
    public void desligaDispositivo()
    {
        ligado = false;
        System.out.println("Dispositivo desligado");
        verificaStatus();
    }
    
    public Boolean estadoEnergia()
    {
        return ligado;
    }
    
    public void executaTeste()
    {
        System.out.println("==================");
        System.out.println("Testando dispositivo genérico '" + nome() + "'");
        System.out.println("-Desligando dispositivo");
        desligaDispositivo();
        System.out.println("-Ligando dispositivo");
        ligaDispositivo();
        System.out.println("Teste realizado com sucesso");
        System.out.println("==================");
    }
   
    
}
