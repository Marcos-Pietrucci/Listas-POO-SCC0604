package ex3;

/**
 *
 * @author marco
 */
public class Ex3 {

    public static void main(String[] args) {

        MinhaListaEncadeada li = new MinhaListaEncadeada();

        //Inserir valores de 1 a 6
        li.inserirN_elementos(6);

        //Inserir 10 no final
        li.inserirFinal(10);
                
        //Remover o primeiro valor
        li.removerElemento(1);

        //Tentar remover um elemento que não existe
        li.removerElemento(100);

        //Remover um elemento no meio da lista
        li.removerElemento(5);

        //Printar os valores
        li.percorreLista();

    }

}
