package ex3;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        //Informacoes
        System.out.println("Lista de ataques:");
        System.out.println("1. Chuva de fogo.");
        System.out.println("2. Ataque de clones.");
        System.out.println("\nLista de defesas:");
        System.out.println("1. Escudo de Agua.");
        System.out.println("2. Invisibilidade.");
        
        //Definindo o Super Heroi
        System.out.println("\nDefinindo o Super Heroi.");
        SuperHeroi heroi = new SuperHeroi("AVATAR", "Yang");
        heroi.adicionarPoder("ataque", "ataqueDeClones");
        heroi.adicionarPoder("defesa", "escudoDeAgua");
        System.out.println("Heroi definido. Total poder: " + heroi.getTotalPoder());
        
        //Definindo vilao
        System.out.println("\nDefinindo o Vilao.");
        Vilao vilao = new Vilao("MR_FIRE", 30);
        vilao.adicionarPoder("ataque", "chuvaDeFogo");
        vilao.adicionarPoder("defesa", "invisibilidade");
        System.out.println("Vilao definido. Total poder: " + vilao.getTotalPoder());
        
        System.out.println("\nVamos comecar a luta!");
        int aux; //Saber se o ataque ocorreu ou nao
        int turno = 0;
        
        while(heroi.getVida() != 0 && vilao.getVida() != 0)
        {
            System.out.println("\n\nTurno " + turno);
            
            //Heroi ataca e vilao defende
            System.out.println("O heroi " + heroi.getNome() + " ataca");
            aux = heroi.atacar("ataqueDeClones", vilao);
            
            if(aux == 1) {
                System.out.println("O vilao " + vilao.getNome() + " defende");
                vilao.defender("invisibilidade", "ataqueDeClones", vilao);
            }
            //Fim da vez do heroi
            
            //Verificando se podemos continuar
            if(vilao.getVida() == 0)
                break;
            
            System.out.print("\n");
            
            //Vilao ataca e heroi defende
            System.out.println("O vilao " + vilao.getNome() + " ataca");
            aux = vilao.atacar("chuvaDeFogo", heroi);
            
            if(aux == 1) {
                System.out.print("O heroi " + heroi.getNome() + " defende");
                heroi.defender("escudoDeAgua", "chuvaDeFogo", heroi);
            }
            //Fim da vez do vilao
            
            turno++;
        }
        
        //Apresentacoa do vencedor
        if(heroi.getVida() == 0) {
            System.out.println("\nO vilao " + vilao.getNome() + " venceu =(");
            System.out.println("Foi revelada a identidade do heroi: " + heroi.getNomeVidaReal());
        }
        else if(vilao.getVida() == 0) {
            System.out.println("\nO heroi " + heroi.getNome() + " venceu =)");
            System.out.println("O vilao " + vilao.getNome() + " pegou " + vilao.getAnosDePrisao() + " anos de cadeia!");
        }
    }
    
}
