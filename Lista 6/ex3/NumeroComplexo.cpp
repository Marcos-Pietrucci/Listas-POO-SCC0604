/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   NumeroComplexo.cpp
 * Author: marco
 * 
 * Created on 22 de Outubro de 2020, 16:25
 */

#include <string>
#include "NumeroComplexo.h"

using namespace std;

NumeroComplexo::NumeroComplexo(double real, double img)
{
    this->a = real;
    this->b = img;
}

NumeroComplexo NumeroComplexo::operator+(const NumeroComplexo& z1) const
{
    //NumeroComplexo n = new NumeroComplexo(1,2); Não é interessante iniciar com new
    NumeroComplexo n(this->a + z1.a , this->b + z1.b);
    return n;
}

NumeroComplexo NumeroComplexo::operator-(const NumeroComplexo& z1) const
{
    //NumeroComplexo n = new NumeroComplexo(1,2); Não é interessante iniciar com new
    NumeroComplexo n(this->a - z1.a , this->b - z1.b);
    return n;
}

NumeroComplexo NumeroComplexo::operator*(const NumeroComplexo& z1) const
{
    double a = z1.a*this->a - z1.b*this->b;
    double b = z1.a*this->b + z1.b*this->a;
    
    return NumeroComplexo(a,b);
}

string NumeroComplexo::toString()
{
    string txt;
    
    txt = to_string(this->a) + " + j*(" + to_string(this->b) + ") ";
    
    return txt;
}

double NumeroComplexo::modulo()
{
    return (double) sqrt(pow(this->a, 2) + pow(this->b,2));
}

void NumeroComplexo::setReal(const double &a)
{
    this->a = a;
}
void NumeroComplexo::setImag(const double &b)
{
    this->b = b;
}





