/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: marco
 *
 * Created on 22 de Outubro de 2020, 16:24
 */

#include "NumeroComplexo.h"

using namespace std;

int main(int argc, char** argv) {
 
    NumeroComplexo z1(1,2);  //Variável estática do tipo NumeroComplexo declarada na STACK    
    NumeroComplexo z2(5,6);
    
   NumeroComplexo z3 = z1 + z2;
   
   NumeroComplexo z4 = z1 - z2 - z3;
   
   NumeroComplexo z5 = z1*z2;
   
   NumeroComplexo z6 = z2*z1 - z3;
   
   NumeroComplexo z7 = z1+z2+z3+z4;
   
   cout << "Temos: \nz1 = " + z1.toString() + "\nz2 = " + z2.toString();
   
   cout << "\n\nz3 = z1 + z2 = " + z3.toString();
    
   cout << "\n\nz4 = z1 - z2 - z3 = " + z4.toString();
    
   cout << "\n\nz1*z2 = " + z5.toString();
    
   cout << "\n\nA equação (z2*z1) - z3 = " + z6.toString();
    
   cout << "\n\nz1 + z2 + z3 + z4 = " + z7.toString();
        
    return 0;
    
    
}

