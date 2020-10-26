/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   quadrado.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 18:38
 */

#ifndef QUADRADO_H
#define QUADRADO_H

#include "poligono.h"

class quadrado : public poligono{
public:
    quadrado();
    quadrado(double);
    double getArea();
    void setBase(double);
    void setAltura(double);
    void setLado(double);
};

#endif /* QUADRADO_H */

