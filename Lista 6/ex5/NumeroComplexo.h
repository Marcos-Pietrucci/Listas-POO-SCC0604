/* 
 * File:   NumeroComplexo.h
 * Author: brcol
 *
 * Created on 23 de Outubro de 2020, 16:33
 */

#ifndef NUMEROCOMPLEXO_H
#define NUMEROCOMPLEXO_H

#include <string>
#include <iostream>
#include <cmath>

/***
 * Metodos do ex3 com modificacoes
 ***/

class NumeroComplexo
{
public:
    NumeroComplexo(int, int);
    NumeroComplexo operator+(NumeroComplexo);
    std::string toString();
    void setReal(int);
    void setImag(int);

private:
    int a;
    int b;
};

#endif /* NUMEROCOMPLEXO_H */

