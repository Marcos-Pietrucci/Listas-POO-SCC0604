/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   quadrado.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 18:38
 */

#include "quadrado.h"

quadrado::quadrado() : poligono(){
    
}

quadrado::quadrado(double pLado){
    altura = base = pLado;
}

double quadrado::getArea()
{
    return (double) (base*altura);
}
void quadrado::setLado(double pLado)
{
    base = altura = pLado;
}

void quadrado::setBase(double pBase)
{
    setLado(pBase);
}

void quadrado::setAltura(double pAltura)
{
    setLado(pAltura);
}


