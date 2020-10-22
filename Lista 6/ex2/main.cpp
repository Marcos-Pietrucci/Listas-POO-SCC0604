/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: marco
 *
 * Created on 22 de Outubro de 2020, 14:25
 */

#include "NumeroComplexo.h" //Este Header já inclui <iostream> <string> e <cmath>

using namespace std;

int main(int argc, char** argv) {

    NumeroComplexo z1(1,2);  //Variável estática do tipo NumeroComplexo declarada na STACK    
    NumeroComplexo *z2 = new NumeroComplexo(5,6); //Alocação dinamica
    
    cout << "A soma z1 + z2 = " + (z1.soma(*z2)).toString();
    
    cout << "\nO modulo de z1 = " + to_string(z1.modulo());
    
    cout << "\nA subtracao z2 - z1 = " + (z2->subtracao(z1)).toString();
    
    cout << "\nA multiplicação z2*z1 = " + (z2->mult(z1)).toString();
    
    delete z2;
    
    return 0;
}

