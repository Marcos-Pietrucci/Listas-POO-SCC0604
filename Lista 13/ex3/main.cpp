/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Montanari
 *
 * Created on 19 de Dezembro de 2020, 12:31
 */

#include <cstdlib>
#include "stack.h"
#include <vector>
#include <string>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    //Inicializa default
    stack<int> intStack;
    //Inicializa com tamanho 4
    stack<string, 4> strStack;
    
    //Auxiliares para remoção
    int aux;
    string auxStr;
    
    //Erro de pilha cheia
    try{
        intStack.insert(5);
        //Causa erro, já que a pilha inicializa com apenas 1 posição
        intStack.insert(8);  
    }catch(runtime_error e){
        //Printa o erro de pilha cheia
        cout << "Erro: " << e.what() << endl;
    }
    
    //Limpa pilha
    intStack.clear();
    
    //Erro de pilha vazia
    try{
        aux = intStack.remove();
    }catch(runtime_error e){
        //Printa o erro de pilha vazia
        cout << "Erro: " << e.what() << endl;
    }
    
    //Insercão e remoção bem sucedida
    try{
        intStack.insert(5);
        //Aumenta o tamanho da pilha
        intStack.resize(2);
        intStack.insert(8);
        aux = intStack.remove();
        cout << "Int removido: " << aux << endl;
        
        //Insere na pilha de strings
        strStack.insert("Programação");
        strStack.insert("Orientada a");
        strStack.insert("Objetos");
        auxStr = strStack.remove();
        cout << "String removida: " << auxStr << endl;
    }catch(runtime_error e){
        cout << "Erro: " << e.what() << endl;
    }
    
    return 0;
}

