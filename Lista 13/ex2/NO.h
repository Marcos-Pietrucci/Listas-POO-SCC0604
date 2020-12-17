/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   NO.h
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 20:04
 */

#ifndef NO_H
#define NO_H

#include <iostream>
#include <cstdlib>

template<class T>
class NO{
private:
    T dado;
    NO<T>* esq;
    NO<T>* dir;
    
public:  
    NO(T dado, NO<T>* esq, NO<T>* dir);
    void liberaNo();
    void setDado(T dado);
    void setEsq(NO<T>* esq);
    void setDir(NO<T>* dir);
    T getDado();
    NO<T>* getEsq();
    NO<T>* getDir();  
};  

template<class T>
NO<T>::NO(T dado, NO<T>* esq, NO<T>* dir){
    this->dado = dado;
    this->esq = esq;
    this->dir = dir;
}

template<class T>
void NO<T>::liberaNo(){
    (this->esq)->liberaNo();
    (this->dir)->liberaNo();
    delete this;
}

template<class T>
void NO<T>::setDado(T dado){
    this->dado = dado;
}

template<class T>
T NO<T>::getDado(){
    return dado;
}

template<class T>
NO<T>* NO<T>::getEsq(){
    return esq;
}

template<class T>
NO<T>* NO<T>::getDir(){
    return dir;
}

template<class T>
void NO<T>::setEsq(NO<T>* esq){
    this->esq = esq;
}

template<class T>
void NO<T>::setDir(NO<T>* dir){
    this->dir = dir;
}

#endif /* NO_H */

