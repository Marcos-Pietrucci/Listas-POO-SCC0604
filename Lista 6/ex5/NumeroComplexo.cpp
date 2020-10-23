/* 
 * File:   NumeroComplexo.cpp
 * Author: brcol
 * 
 * Created on 23 de Outubro de 2020, 16:33
 */

/***
 * Metodos do ex3 com modificacoes
 ***/

#include <string>
#include "NumeroComplexo.h"

using namespace std;

NumeroComplexo::NumeroComplexo(int real, int img) {
    this->a = real;
    this->b = img;
}

NumeroComplexo NumeroComplexo::operator+(NumeroComplexo z1) {
    NumeroComplexo n(this->a + z1.a , this->b + z1.b);
    return n;
}

string NumeroComplexo::toString() {
    string txt;
    
    txt = to_string(this->a) + " + j*(" + to_string(this->b) + ") ";
    
    return txt;
}

void NumeroComplexo::setReal(int a) {
    this->a = a;
}
void NumeroComplexo::setImag(int b) {
    this->b = b;
}