/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author marco
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ABB<Integer> valores = new ABB();
        
        valores.inserir(5);
        valores.inserir(4);
        valores.inserir(9);
        valores.inserir(2);
        valores.inserir(7);
        valores.inserir(12);
        valores.inserir(6);
        valores.inserir(8);
        
        valores.imprimirEmOrdem();
        
        //Teste de busca
        if(valores.buscar(7))
            System.out.println("Encontrei o 7!!");
        else
            System.out.println("Não encontrei o 7 :(");
        
        if(valores.buscar(23))
            System.out.println("Encontrei o 23!!");
        else
            System.out.println("Não encontrei o 23 :(");
        
        //Remover o nodo 7
        valores.removeNodo(7);
        System.out.println("Removi o 7");
        valores.imprimirEmOrdem();
        
        //Remover o nodo 8
        valores.removeNodo(8);
        System.out.println("Removi o 8");
        valores.imprimirEmOrdem();
         
        //Remover o nodo 4
        valores.removeNodo(4);
        System.out.println("Removi o 4");
        valores.imprimirEmOrdem();
        
    }
    
}
