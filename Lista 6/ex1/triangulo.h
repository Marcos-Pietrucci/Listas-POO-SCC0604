/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   triangulo.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 19:19
 */

#ifndef TRIANGULO_H
#define TRIANGULO_H

#include "poligono.h"
class triangulo : public poligono{
public:
    triangulo();
    triangulo(double,double);
    double getArea();
private:

};

#endif /* TRIANGULO_H */

