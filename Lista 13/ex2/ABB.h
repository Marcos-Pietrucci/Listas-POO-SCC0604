/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ABB.h
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 20:01
 */

#ifndef ABB_H
#define ABB_H

#include <iostream>
#include <cstdlib>
#include "NO.h"

template<class T>
class ABB {
private:
    NO<T>* raiz;
    NO<T>* removeAtual(NO<T>* atual);

public:
    ABB();
    void libera(NO<T>* no);
    void insere(T dado);
    void imprimeEmOrdem(NO<T>* no);
    NO<T>* getRaiz();
    void remove(T valor);
    int busca(T valor);
    
};

template<class T>
ABB<T>::ABB(){
    this->raiz = NULL;
}

template<class T>
NO<T>* ABB<T>::getRaiz(){
    return this->raiz;
}

template<class T>
void ABB<T>::libera(NO<T>* no){
    if(no == NULL)
        return;
    
    libera(no->getEsq());
    libera(no->getDir());
    delete(no);
}

template<class T>
void ABB<T>::insere(T dado){    
    NO<T>* novo = new NO<T>(dado, NULL, NULL);
    
    if(novo == NULL)
        return;

    if(this->raiz == NULL)
        this->raiz = novo;
    else{
        NO<T>* atual = this->raiz;
        NO<T>* ant = NULL;
        while(atual != NULL){
            ant = atual;
            if(dado == atual->getDado()){
                free(novo);
                return;//elemento j� existe
            }

            if(dado > atual->getDado())
                atual = atual->getDir();
            else
                atual = atual->getEsq();
        }
        if(dado > ant->getDado())
            ant->setDir(novo);
        else
            ant->setEsq(novo);
    }
}

template<class T>
void ABB<T>::imprimeEmOrdem(NO<T>* no){
    if(no == NULL)
        return;
    
    imprimeEmOrdem(no->getEsq());
    cout << no->getDado() << endl;
    imprimeEmOrdem(no->getDir());
}

template<class T>
NO<T>* ABB<T>::removeAtual(NO<T>* atual) {
    
    NO<T> *no1, *no2;
    
    if(atual->getEsq() == NULL){
        no2 = atual->getDir();
        free(atual);
        return no2;
    }
    no1 = atual;
    no2 = atual->getEsq();
    while(no2->getDir() != NULL){
        no1 = no2;
        no2 = no2->getDir();
    }
    // no2 eh o no anterior a r
    // no1 eh o pai de no2
    if(no1 != atual){
        no1->setDir(no2->getEsq());
        no2->setEsq(atual->getEsq());
    }
    no2->setDir(atual->getDir());
    delete(atual);
    return no2;
}

template<class T>
void ABB<T>::remove(T valor){
    
    if(raiz == NULL)
        return;
    
    NO<T>* ant = NULL;
    NO<T>* atual = raiz;
    
    while(atual != NULL){
        if(valor == atual->getDado()){
            if(atual == raiz)
                raiz = removeAtual(atual);
            else{
                if(ant->getDir() == atual)
                    ant->setDir(removeAtual(atual));
                else
                    ant->setEsq(removeAtual(atual));
            }
            return;
        }
        ant = atual;
        
        if(valor > atual->getDado())
            atual = atual->getDir();
        else
            atual = atual->getEsq();
    }
}

template<class T>
int ABB<T>::busca(T valor){
    
    if(raiz == NULL)
        return 0;
    
    NO<T>* atual = raiz;
    
    while(atual != NULL){
        if(valor == atual->getDado()){
            return 1;
        }
        if(valor > atual->getDado())
            atual = atual->getDir();
        else
            atual = atual->getEsq();
    }
    return 0;
}

#endif /* ABB_H */

