/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pilha.cpp
 * Author: brcol
 * 
 * Created on 16 de Dezembro de 2020, 15:24
 */

#include "Pilha.h"
#include "PilhaCheia.h"
#include "PilhaVazia.h"

Pilha::Pilha( int size ) {
    this->size = size;
    dados = new int[size];
    topo = -1;
}

void Pilha::push( int valor ){
    topo++;
    
    // Fazendo o tratamento de excecao
    if( topo == size ){
        throw PilhaCheia();
    }
    
    dados[topo] = valor;
}

int Pilha::pop(){    
    // Fazendo o tratamento de excecao
    if( topo == -1 ){
        throw PilhaVazia();
    }
    
    int valorTopo = dados[topo]; // Variavel auxiliar
    topo--; //Descendo na stack
    
    return valorTopo;
}

Pilha::~Pilha() {
    delete dados;
}

