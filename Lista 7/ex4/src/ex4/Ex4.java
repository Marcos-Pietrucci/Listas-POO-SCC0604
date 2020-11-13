package ex4;
import java.util.*;

/**
 *
 * @author Bruno Alvarenga Colturato
 */
public class Ex4 {

    public static void main(String[] args) {
        
        int arraySize = (int) Math.pow(10, 6); //Tamanho do array de teste
        int qtdAcess = (int) Math.pow(10, 5); //Quantidade de números a serem manipulados
        int i,j;
        Double aux;
        
        /************************ ArrayList ************************/
        ArrayList<Double> array = new ArrayList();
        
        long t1i = System.currentTimeMillis();
        
        //Preenchendo o ArrayList
        for(j = 0; j < arraySize; j++) {
            array.add(Math.random()); //Gerando números double aleatórios
        }
        
        /** ACESSO A ELEMENTOS DO ARRAYLIST **/
        for(j = 0; j < qtdAcess; j++) {
            i = (int) (Math.random() * (array.size()-1)); //Índice aleatório
            aux = array.get(i); //Acessando o elemento do ArrayList
        }
        
        long t1f = System.currentTimeMillis();
        
        /** REMOÇÃO E INSERÇÃO DE ELEMENTOS DO ARRAYLIST **/
        long t2i = System.currentTimeMillis();
        
        //Removendo e inserindo elementos
        for(j = 0; j < qtdAcess; j++) {
            i = (int) (Math.random() * (array.size()-1)); //Índice aleatório
            array.remove(i);  //Removendo o elemento do ArrayList
        }
        
        for(j = 0; j < qtdAcess; j++) {
            array.add(Math.random()); //Gerando números double aleatórios
        }
        
        long t2f = System.currentTimeMillis();
        
        /************************ LinkedList ************************/
        LinkedList<Double> linked = new LinkedList();
        
        long t3i = System.currentTimeMillis();
        
        //Preenchendo a LinkedList
        for(j = 1; j < arraySize; j++) {
            linked.add(Math.random()); //Gerando números double aleatórios
        }
        
        /** ACESSO A ELEMENTOS DO LINKEDLIST **/        
        for(j = 0; j < qtdAcess; j++) {
            i = (int) (Math.random() * (linked.size()-1)); //Índice aleatório
            aux = linked.get(i); //Acessando o elemento do LinkedList
        }
        
        long t3f = System.currentTimeMillis();
        
        /** REMOÇÃO E INSERÇÃO DE ELEMENTOS DO LINKEDLIST **/
        long t4i = System.currentTimeMillis();
        
        //Removendo e inserindo elementos
        for(j = 0; j < qtdAcess; j++) {
            i = (int) (Math.random() * (linked.size()-1)); //Índice aleatório
            linked.remove(i);  //Removendo o elemento do LinkedList
        }
        
        for(j = 0; j < qtdAcess; j++) {
            linked.add(Math.random()); //Gerando números double aleatórios
        }
        
        long t4f = System.currentTimeMillis();
        
        /**************** Impressão dos resultados *************************/
        System.out.println("Resultados para vetores com " + arraySize + " elementos e " + qtdAcess + " acessos.");
        System.out.println();
        System.out.println("ArrayList: inserir e acessar elementos: " + (t1f - t1i) + "ms");
        System.out.println("ArrayList: remover e inserir elementos: " + (t2f - t2i) + "ms");
        System.out.println();
        System.out.println("LinkedList: inserir e acessar elementos: " + (t3f - t3i) + "ms");
        System.out.println("LinkedList: remover e inserir elementos: " + (t4f - t4i) + "ms");
    }
}
