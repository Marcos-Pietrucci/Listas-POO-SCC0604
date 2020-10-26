/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   triangulo.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 19:19
 */

#include "triangulo.h"

triangulo::triangulo() : poligono(){
    
}

triangulo::triangulo(double pBase, double pAltura){
    base = pBase;
    altura = pAltura;
}

double triangulo::getArea()
{
    return (double) (base * altura)/2;
}


