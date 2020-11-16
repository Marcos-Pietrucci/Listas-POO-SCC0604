/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo18.arvore.aula;

/**
 *
 * @author Robson
 */
public class Exemplo18ArvoreAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ABB<String> strings = new ABB();
        strings.inserir("Carlos");
        strings.inserir("Ana");
        strings.inserir("Jose");
        strings.inserir("Robson");
        strings.inserir("Pedro");
        strings.inserir("Antonio");
        if (strings.buscar("Robson"))
            System.out.println("Robson esta na arvore");
        else
            System.out.println("Robson NAO esta na arvore");
        strings.imprimirEmOrdem();
    }
    
}
