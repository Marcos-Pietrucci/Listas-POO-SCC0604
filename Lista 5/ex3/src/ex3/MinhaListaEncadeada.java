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
public class MinhaListaEncadeada {
    
    Elemento elem;
    
    //Cria a lista vazia
    MinhaListaEncadeada()
    {
        this.elem = null;
    }
    
    public void inserirFinal(int pnum)
    {
        Elemento nodo = new Elemento(pnum);
        
        if(this.elem == null) //Nao ha nenhum elemento na lista
        {
           this.elem = nodo;
        }
        else
        {
            Elemento aux = this.elem;
            
            while(aux.prox != null)
            {
                aux = aux.prox;
            }
            
            aux.prox = nodo; 
        }
    }
    
    public void removerElemento(int pnum) 
    {        
        if(this.elem == null) //Nao ha nenhum elemento na lista
        {
           System.out.println("Erro: A lista esta vazia");
        }
        else
        {
            Elemento aux = this.elem, ant = this.elem;
            
            while(aux.prox != null && aux.num != pnum)
            {
                ant = aux;
                aux = aux.prox;
            }
            
            if(aux.num != pnum)
            {
               System.out.println("Elemento não encontrado"); 
            }            
            else if(ant == aux) //Remover o primeiro elemento
            {
                if(aux.prox  == null) //Remover o unico elemento
                    aux = null;
                else            
                {   //Remover o primeiro elemento de uma lista com mais de 1 elemento
                    //Preciso acessar diretamente o atributo do inicio da lista
                    this.elem = aux.prox;
                }
            }
            else //Remover um elemento qualquer do meio da lista
            {
                ant.prox = aux.prox;
                aux = null;
            }
        }
    }
    
    public void inserirN_elementos(int n)
    {
        int i;
        for(i = 1 ; i <= n; i++)
        {
            this.inserirFinal(i);
        }    
    }
    
    public void percorreLista()
    {
        if(this.elem == null) //Nao ha nenhum elemento na lista
        {
           System.out.println("Nao ha elementos na lista...");
        }
        else
        {
            System.out.println("Temos os seguintes valores:\n");
            
            Elemento aux = this.elem;
            
            while(aux.prox != null)
            {
                System.out.println(aux.num);
                aux = aux.prox;
            }
            //Tem que printar o ultimo elemento, que efetivamente aponta para nulo
            System.out.println(aux.num);
        }
    
    }
    
    
}
