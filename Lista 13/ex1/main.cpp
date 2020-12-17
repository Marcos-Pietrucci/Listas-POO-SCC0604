/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 16:36
 */

#include <cstdlib>
#include <iostream>
#include <string>
#include "ClasseGenerica.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    // Testando com int
    ClasseGenerica< int > cg1( 4, 6 );
    cout << "Teste para inteiros:" << endl;
    cout << "Menor: " << cg1.getMin() << endl;
    cout << "Maior: " << cg1.getMax() << endl;
    cout << "Soma: " << cg1.getSum() << endl << endl;
    
    // Testando com double
    ClasseGenerica< double > cg2( 8.5, 6.3 );
    cout << "Teste para double:" << endl;
    cout << "Menor: " << cg2.getMin() << endl;
    cout << "Maior: " << cg2.getMax() << endl;
    cout << "Soma: " << cg2.getSum() << endl << endl;
    
    // Testando com string
    ClasseGenerica< string > cg3( "PlayStation", "Xbox" );
    cout << "Teste para string (menor e maior em termos de ordem alfabetica): " << endl;
    cout << "Menor: " << cg3.getMin() << endl;
    cout << "Maior: " << cg3.getMax() << endl;
    cout << "Soma: " << cg3.getSum() << endl << endl;     
    
    return 0;
}

