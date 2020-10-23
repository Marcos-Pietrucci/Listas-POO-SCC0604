/* 
 * File:   main.cpp
 * Author: brcol
 *
 * Created on 23 de Outubro de 2020, 16:29
 */

#include <cstdlib>
#include "NumeroComplexo.h"
#include <vector> //Biblioteca solicitada pela questao

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    //Lemos a quantidade de numeros complexos a serem gerados
    int n;
    cout << "Digite a quantidade de numeros a serem gerados: ";
    cin >> n;
    cout << endl << "n = " << n << endl;
    cout << endl;
    
    //Criando o vetor
    std::vector<NumeroComplexo> vetor;
    
    //Preenchendo o vetor
    int i;
    int a;
    int b;
    
    //Vetor auxiliar 
    NumeroComplexo *auxiliar = new NumeroComplexo(0, 0);
    
    for(i=0; i<n; i++) {
        //Gerando numeros aleatorios
        a = rand()%100;
        b = rand()%100;
        
        //Gerando e imprimindo os objetos
        auxiliar->setReal(a);
        auxiliar->setImag(b);
        cout << i+1 << ": " + auxiliar->toString() << endl;
        
        /***
         * Adicionando ao final do vetor uma copia do elemento ao qual
         * o ponteiro auxiliar aponta.
        ***/
        vetor.push_back(*auxiliar);
    }
    
    //Somando os elementos do vetor
    std::vector<NumeroComplexo>::iterator iterador;
    NumeroComplexo resultadoSoma(0, 0);
    
    for(iterador = vetor.begin(); iterador != vetor.end(); iterador++) {
        resultadoSoma =  resultadoSoma + *iterador; //Soma 'iterador' ao resultadoSoma
    }
    
    //Imprime a soma
    cout << "Soma final = " << resultadoSoma.toString() << endl;
    
    //Liberando memoria
    delete auxiliar;
    vetor.clear(); //Apagando os objetos criados
    
    return 0;
}

