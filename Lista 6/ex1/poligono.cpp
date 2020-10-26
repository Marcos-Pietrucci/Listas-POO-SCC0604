/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   poligono.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 18:39
 */

#include "poligono.h"

poligono::poligono()
{
    this->base = this->altura =0;
}

void poligono::setBase(double pBase)
{
    this->base = pBase;
}

void poligono::setAltura(double pAltura)
{
    this->altura = pAltura;
}

poligono::~poligono()
{
    
}

