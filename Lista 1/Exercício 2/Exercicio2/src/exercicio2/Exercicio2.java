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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        driver g = new driver("Genérico");
        impressora i = new impressora("Impressora", 100);
        rede r = new rede("Rede", 1000.0f);
        video v = new video("Video",50);
        
        System.out.println("------------------");
        System.out.println("Driver genérico: " + i.nome());
        g.ligaDispositivo();
        g.executaTeste();
        g.desligaDispositivo();
        System.out.println("------------------");
        System.out.println("");
        
        System.out.println("------------------");
        System.out.println("Driver de impressora: " + i.nome());
        i.ligaDispositivo();
        i.executaTeste();
        i.imprimePaginas(5);
        i.recarregaTinta(5);
        i.desligaDispositivo();
        System.out.println("------------------");
        System.out.println("");
        
        System.out.println("------------------");
        System.out.println("Driver de vídeo: " + v.nome());
        v.ligaDispositivo();
        v.executaTeste();
        v.alteraBrilhoDeExibicao(60);
        v.desligaDispositivo();
        System.out.println("------------------");
        System.out.println("");
        
        System.out.println("------------------");
        System.out.println("Drive de rede: " + r.nome());
        r.ligaDispositivo();
        r.executaTeste();
        r.enviaPacoteDeDados("Pacote 1",500.0f);
        r.recarregaFranquia(300.0f);
        r.desligaDispositivo();
        System.out.println("------------------");
        System.out.println("");
        
        
        
    }
    
}
