
package ex3;

public class ABB <T extends Comparable> {
    private No<T> raiz;
    
    private int indicaBuscaPai = 0; //1 indica que é pai de um filho à esquerda
                                    //2 indica que é pai de um filho à direita
    ABB() {
        raiz = null;
    }
    
    ABB(T valor) {
        raiz = new No<T>(valor, null, null);
    }
    
    private No<T> inserirRec(No<T> atual, T valor) {
        if (atual == null)
            atual = new No<T>(valor, null, null); // novo no
        else
            if (atual.getValor().compareTo(valor) > 0)
                atual.setEsq(inserirRec(atual.getEsq(), valor)); // insere a esquerda
            else
                atual.setDir(inserirRec(atual.getDir(), valor)); // insere a direita
        return atual;
    }
    
    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor); // inicia recursividade
    }
    
    //Modifiquei um pouco a função, para que ela retorne o nodo buscado em si
    private No<T> buscarNodo(No<T> atual, T valor) {
        if (atual == null)
            return null; // nao encontrou
        else
            if (atual.getValor().compareTo(valor) == 0)
                return atual; // encontrou
            else // continua a busca
                if (atual.getValor().compareTo(valor) > 0)
                    return buscarNodo(atual.getEsq(), valor); // busca a esquerda
                else
                    return buscarNodo(atual.getDir(), valor); // busca a direita
    }
    
    public boolean buscar(T valor) {
        No<T> aux = buscarNodo(raiz, valor); // inicia recursividade
        
        //Se ele não encontrou o nodo, o ponteiro aponta para nulo
        if(aux == null)
            return false;
        else
            return true;
    }
    
    private void imprimirEmOrdemRec(No<T> atual) {
        if (atual != null) {
            imprimirEmOrdemRec(atual.getEsq()); // imprime lado esquerdo primeiro
            System.out.print(atual.getValor() + ", "); // imprime no atual
            imprimirEmOrdemRec(atual.getDir()); // imprime lado direito por ultimo
        }
    }
    
    public void imprimirEmOrdem() {
        System.out.print("Elementos em ordem: ");
        imprimirEmOrdemRec(raiz);
        System.out.println();
    }
    
    //Função que busca o pai do nodo cujo valor é "valor"
    private No<T> buscarNodoPai(No<T> atual, T valor) {
        if (atual == null)
            return null; // nao encontrou
        else
            if (atual.getDir().getValor().compareTo(valor) == 0) // encontrou o filho
            {
                //Indicar que o nodo procurado é filho direito do pai
                indicaBuscaPai = 2;
                return atual; // Retorna o pai
            }
            else if (atual.getEsq().getValor().compareTo(valor) == 0) // encontrou o filho
            {
                //Indicar que o nodo procurado é filho esquerdo do pai
                indicaBuscaPai = 1;
                return atual;  //Retorna o pai
            }
            else
            {
                //Caso não tenha encontrado, continuar com a busca recursiva
                if(atual.getValor().compareTo(valor) > 0)
                    return buscarNodoPai(atual.getEsq(), valor); // busca a esquerda
                else
                    return buscarNodoPai(atual.getDir(), valor); // busca a direita
            }
    }
    
    public boolean removeNodo(T valor)
    {
        No<T>pai = buscarNodoPai(raiz, valor);
        No<T>aux;
        
        
        if(pai == null)
            return false;
        else
        {
            if(indicaBuscaPai == 1) //É o filho da esquerda
            {
                //Varre todos os filhos à esquerda do filho direito
                aux = pai.getDir();
                while(aux.getEsq() != null)
                    aux = aux.getEsq();
                
                //Adiciona o ponteiro no lugar correto
                //À esquerda de todos os filhos direitos
                aux.setEsq(pai.getEsq().getDir());              
                pai.setEsq(pai.getEsq().getEsq());
            }
            else if(indicaBuscaPai == 2) //O nodo a ser removido é o filho da direita
            {
                //Varre todos os filhos à direita do filho esquerdo
                aux = pai.getEsq();
                while(aux.getDir() != null)
                    aux = aux.getDir();
                
                //Adiciona o ponteiro no lugar correto
                //À direita de todos os filhos direitos
                aux.setDir(pai.getDir().getEsq());
                pai.setDir(pai.getDir().getDir());
            }
            
            indicaBuscaPai = 0;
            return true;
        }
        
        
    }
}
