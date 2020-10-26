/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 17:37
 */

#include <cstdlib>
#include <iostream>
#include "Quadrado.h"
#include "Triangulo.h"
#include "Poligono.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    quadrado s;
    cout << "A área do quadrado é: " << s.getArea() << endl;
    s.setAltura(4);
    cout << "A nova área do quadrado é: " << s.getArea() << endl;
    s.setBase(5);
    cout << "A nova área do quadrado é: " << s.getArea() << endl;
    s.setLado(6);
    cout << "A nova área do quadrado é: " << s.getArea() << endl;
    triangulo t(4,2);
    cout << "A área do triângulo é: " << t.getArea() << endl;
    t.setAltura(5);
    t.setBase(6);
    cout << "A nova área do triângulo é: " <<t.getArea() << endl;
    
    return 0;
}

