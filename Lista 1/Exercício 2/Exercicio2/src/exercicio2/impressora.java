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
public class impressora extends driver{
    
    private int nivelTinta;
    
    impressora(String pNome, int nivelTinta){
        super(pNome);
        this.nivelTinta = 100;
    }
    
    
    public void imprimePaginas(int numeroPaginas)
    {
        if(!estadoEnergia()) ligaDispositivo();
        if(temTinta(numeroPaginas)){
            System.out.println(numeroPaginas + " folha(s) impressa(s) com sucesso!");
            nivelTinta -= numeroPaginas;
            verificaStatus();
        }else{
            System.out.println("Tinta insuficiente para a impressão, recarregue e tente novamente (Nível de tinta atual: " + nivelTinta + ")");
        }
    }
    
    public void recarregaTinta(int tinta)
    {
        if(tinta <= 0)
        {
           System.out.println("Nível de tinta inválido!");
           return;
        }
        nivelTinta += tinta;
        System.out.println("Foram adicionados " + tinta + "% de tinta ao tanque da impressora!"); 
        verificaStatus();
    }
    
    private Boolean temTinta(int numeroPaginas)
    {
        return nivelTinta >= numeroPaginas;
    }
    
    @Override
    public void verificaStatus()
    {
        System.out.print("O dispositivo de impressão " + nome());
        if(estadoEnergia())
            System.out.print(" está ligado");
        else
            System.out.print(" está desligado");
        
        System.out.print(" e com " + nivelTinta + "% de tinta restante");
        System.out.println("");
    }
    
    @Override
    public void executaTeste()
    {
        System.out.println("==================");
        if(!estadoEnergia()) ligaDispositivo();
        System.out.println("Testando dispositivo de impressão '" + nome() + "'");
        System.out.println("-Imprimindo página teste");
        imprimePaginas(1);
        System.out.println("Teste realizado com sucesso");
        System.out.println("==================");
    }

}
