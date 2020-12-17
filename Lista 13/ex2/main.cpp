/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 19:57
 */

#include <cstdlib>
#include <string>
#include <iostream>

using namespace std;

#include "ABB.h"
/*
 * 
 */
int main(int argc, char** argv) {
    
    ABB<int> a;
    
    a.insere(5);
    a.insere(4);
    a.insere(9);
    a.insere(2);
    a.insere(7);
    a.insere(12);
    a.insere(6);
    a.insere(8);
        
    a.imprimeEmOrdem(a.getRaiz());

    //Teste de busca
    if(a.busca(7))
        cout << "Encontrei o 7!!" << endl;
    else
        cout << "Não encontrei o 7 :(" << endl;

    if(a.busca(23))
        cout << "Encontrei o 23!!" << endl;
    else
        cout << "Não encontrei o 23 :(" << endl;

    //Remover o nodo 7
    a.remove(7);
    cout << "Removi o 7" << endl;
    a.imprimeEmOrdem(a.getRaiz());

    //Remover o nodo 8
    a.remove(8);
    cout << "Removi o 8" << endl;
    a.imprimeEmOrdem(a.getRaiz());

    //Remover o nodo 4
    a.remove(4);
    cout << "Removi o 4" << endl;
    a.imprimeEmOrdem(a.getRaiz());
    
    a.libera(a.getRaiz());
    
    return 0;
}

