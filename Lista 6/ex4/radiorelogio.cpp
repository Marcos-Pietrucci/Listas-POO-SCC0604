/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radiorelogio.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 21:40
 */

#include "radiorelogio.h"
#include <iostream>

using namespace std;

radiorelogio::radiorelogio() : radio(), relogio() {
}

void radiorelogio::setAlarme(horario pHora, double pFreq)
{
    relogio::setAlarme(pHora);
    this->e = pFreq; 
    cout << "Definido alarme no horario " << pHora.hora <<  ":" << pHora.minuto 
            << " e na estação " << this->e << endl;
   
}

radiorelogio::~radiorelogio() {
}

