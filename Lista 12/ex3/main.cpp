/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 15:22
 */

#include <cstdlib>
#include <iostream>
#include "Pilha.h"
#include "PilhaCheia.h"
#include "PilhaVazia.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    // Criando a pilha
    Pilha* p = new Pilha( 5 );
    
    // Testando o código
    try{
        
        p->push(1);
        p->push(2);
        p->push(3);
        p->push(4);
        p->push(5);
        
        p->push(6); // Gera uma excecao
        
        cout << p->pop() << endl;
        cout << p->pop() << endl;
        cout << p->pop() << endl;
        cout << p->pop() << endl;
        cout << p->pop() << endl;
        
        cout << p->pop() << endl; // Gera uma excecao
        
    } catch( PilhaCheia e ){
        cout << "Erro detectado: " << e.getMessage() << endl;
    } catch( PilhaVazia e ){
        cout << "Erro detectado: " << e.getMessage() << endl;
    }
    
    delete p; // Deletando a pilha
    
    return 0;
}

