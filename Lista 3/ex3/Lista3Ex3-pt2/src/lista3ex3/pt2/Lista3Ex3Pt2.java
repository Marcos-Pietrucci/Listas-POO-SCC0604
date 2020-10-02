/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex3.pt2;
import java.util.ArrayList;

/**
 *
 * @author montanari
 */
public class Lista3Ex3Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<PegadaDeCarbono> pegada = new ArrayList();
        
        //Carros
        Carro carro1 = new Carro("Toyota", "Corolla", "Preto", 2016, Carro.combustivel.gasolina, 5, 10.00f, 37200.0f);
        Carro carro2 = new Carro("Honda", "Civic", "Branco", 2017, Carro.combustivel.gasolina, 5, 10.0f, 47000.0f);
        
        //Bicicletas
        Bicicleta bike1 = new Bicicleta("Caloi",  29, "Mountain Bike", "Vermelho");
        Bicicleta bike2 = new Bicicleta("Monark", 26, "Vintage", "Preta");
        
        //Predios
        /*
        
        Como a classe Predio agora é abstrada isso não funciona:
        Predio predio1 = new Predio ("Paulista", 200, 30500, 0.76f);
        Predio predio2 = new Predio ("São João", 100, 10500);
        já que não é possível chamar o construtor de uma classe Predio por uma
        classe que não é subclasse de Predio.
        
        Instanciando Casa e Escola diretamente o código passa a funcionar de novo
            
        */        
        Escola escola1 = new Escola("Paulista", 200, Escola.tipo.publica, 20000, 0.76f);
        Casa casa1 = new Casa("Casa do Yudi", 5, Casa.tipo.apartamento, 600);


        //Adicionando ao array
        pegada.add(carro1);
        pegada.add(carro2);
        pegada.add(bike1);
        pegada.add(bike2);
        pegada.add(escola1);
        pegada.add(casa1);
        
 
        for(int i=0;i<6;i++)
        {
            float num = pegada.get(i).getPegadaDeCarbono();
            System.out.println("A pegada total do objeto '" + pegada.get(i).getNomeStr() + "' é: " + num + " Kg de CO2");
        }
        
    }
    
}
