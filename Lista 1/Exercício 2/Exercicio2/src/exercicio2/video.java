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
public class video extends driver{
    
    private int brilho;
    
    video(String pNome, int brilhoInicial)
    {
        super(pNome);
        brilho = brilhoInicial;
        
    }
    
    public void alteraBrilhoDeExibicao(int pBrilho)
    {
        if(!estadoEnergia()) ligaDispositivo();
        if (pBrilho<0 || pBrilho>100){
            System.out.println("Brilho inválido");
        }else{
            brilho = pBrilho; 
            System.out.println("Brilho configurado em " + brilho + "%");
            verificaStatus();
        }
    }
    
    /**
     *
     */
    @Override
    public void verificaStatus()
    {
        System.out.print("O dispositivo de vídeo '" + nome() + "'");
        if(estadoEnergia())
            System.out.print(" está ligado");
        else
            System.out.print(" está desligado");
        
        System.out.print(" e com " + brilho + " de brilho");
        System.out.println("");
    }
    
    @Override
    public void executaTeste()
    {
        System.out.println("==================");
        if(!estadoEnergia()) ligaDispositivo();
        System.out.println("Testando dispositivo de vídeo '" + nome() + "'");
        System.out.println("-Alterando brilho de exibicão");
        alteraBrilhoDeExibicao(brilho+1);
        System.out.println("-Retornando ao brilho original");
        alteraBrilhoDeExibicao(brilho-1);
        System.out.println("Teste realizado com sucesso");
        System.out.println("==================");
    }
    
}
