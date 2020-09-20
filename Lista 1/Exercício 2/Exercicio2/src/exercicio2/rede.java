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
public class rede extends driver{
    
    private float franquiaDados;
     
    
    rede(String pNome, float franquiaInicial)
    {
        super(pNome);
        franquiaDados = franquiaInicial;
    }
    
    public void enviaPacoteDeDados(String pacote, float tamanho)
    {
        if(!estadoEnergia()) ligaDispositivo();
        if(temFranquia(tamanho)){
            System.out.println("Pacote " + pacote + " de " + tamanho + " MBps " + " enviado");
            verificaStatus();
        }else{
            System.out.println("Franquia insuficiente para enviar os dados, recarregue!");
            System.out.println("");
        }
    } 
    
    public void recarregaFranquia(float franquiaComprada)
    {
        if(franquiaComprada <= 0)
        {
            System.out.println("Franquia inválida!");
            return;
        }
        
        franquiaDados += franquiaComprada;
        System.out.println("Franquia recarregada!");
        verificaStatus();
    }
    
    private Boolean temFranquia(float tamanho)
    {
        return franquiaDados >= tamanho;
    }
   
    @Override
    public void verificaStatus()
    {
        System.out.print("O dispositivo de rede '" + nome() + "'");
        if(estadoEnergia())
            System.out.print(" está ligado");
        else
            System.out.print(" está desligado");
        
        System.out.print(" e com " + franquiaDados + " MBps de franquia restantes");
        System.out.println("");
    }
    
    @Override
    public void executaTeste()
    {
        System.out.println("==================");
        if(!estadoEnergia()) ligaDispositivo();
        System.out.println("Testando dispositivo de rede '" + nome() + "'");
        System.out.println("-Enviando pacote teste");
        enviaPacoteDeDados("Teste",0.1f);
        System.out.println("Teste realizado com sucesso");
        System.out.println("==================");
    }
    
   
}
