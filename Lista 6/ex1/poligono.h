/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   poligono.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 18:39
 */

#ifndef POLIGONO_H
#define POLIGONO_H

class poligono {
public:
    poligono();
    void setBase(double);
    void setAltura(double);
    virtual double getArea() = 0;
    virtual ~poligono();
protected:
    double base;
    double altura;

};

#endif /* POLIGONO_H */

