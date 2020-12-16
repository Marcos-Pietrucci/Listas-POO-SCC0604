/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pilha.h
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 15:24
 */

#ifndef PILHA_H
#define PILHA_H

class Pilha {
public:
    Pilha( int size );
    void push( int valor );
    int pop();
    virtual ~Pilha();
private:
    int size;
    int* dados;
    int topo;

};

#endif /* PILHA_H */

