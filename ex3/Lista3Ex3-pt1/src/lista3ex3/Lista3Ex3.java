/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex3;
import java.util.ArrayList;

/**
 *
 * @author montanari
 */
public class Lista3Ex3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<PegadaDeCarbono> pegada = new ArrayList();
        
        //Carros
        Carro carro1 = new Carro("Toyota", "Corolla", "Preto", 2016, Carro.combustivel.gasolina, 5, 8.0f, 37200.0f);
        Carro carro2 = new Carro("Honda", "Civic", "Branco", 2017, Carro.combustivel.gasolina, 5, 10.0f, 47000.0f);
        
        //Bicicletas
        Bicicleta bike1 = new Bicicleta("Caloi",  29, "Mountain Bike", "Vermelho");
        Bicicleta bike2 = new Bicicleta("Monark", 26, "Vintage", "Preta");
        
        //Predios
        Predio predio1 = new Predio ("Paulista", 200, 30500, 0.76f);
        Predio predio2 = new Predio ("São João", 100, 10500);
   
        //Adicionando ao array
        pegada.add(carro1);
        pegada.add(carro2);
        pegada.add(bike1);
        pegada.add(bike2);
        pegada.add(predio1);
        pegada.add(predio2);
        
        for(int i=0;i<6;i++)
        {
            float num = pegada.get(i).getPegadaDeCarbono();
            System.out.println("A pegada total do objeto '" + pegada.get(i).getNome() + "' é: " + num + " Kg de CO2");
        }
        
    }
    
}
