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
public class No <T extends Comparable> {
    private T valor;
    private No<T> esq;
    private No<T> dir;
    
    No(T valor, No<T> esq, No<T> dir) {
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public T getValor() {
        return valor;
    }
    
    public void setEsq(No<T> esq) {
        this.esq = esq;
    }
    
    public No<T> getEsq() {
        return esq;
    }
    
    public void setDir(No<T> dir) {
        this.dir = dir;
    }
    
    public No<T> getDir() {
        return dir;
    }
}
