/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   NumeroComplexo.h
 * Author: marco
 *
 * Created on 22 de Outubro de 2020, 14:04
 */

#ifndef NUMEROCOMPLEXO_H
#define NUMEROCOMPLEXO_H

#include <string>
#include <iostream>
#include <cmath>

class NumeroComplexo {
public:
    NumeroComplexo(double real = 0, double img = 0);
    NumeroComplexo soma(const NumeroComplexo &z1) const;
    NumeroComplexo subtracao(const NumeroComplexo &z1) const;
    NumeroComplexo mult(const NumeroComplexo &z1) const;
    double modulo();
    std::string toString();
    void setReal(const double &a);
    void setImag(const double &b);
    
    //virtual ~NumeroComplexo(); Não é necessário destrutor pois não será herdada por nenhuma outra
private:
    double a;
    double b;

};

#endif /* NUMEROCOMPLEXO_H */

