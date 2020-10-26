/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   relogio.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 21:40
 */

#include "relogio.h"
#include <iostream>

using namespace std;
relogio::relogio() {
    hora = {0,0};
    alarme = {0,0}; 
}

void relogio::getHora()
{
    cout << "Horário atual é " << this->hora.hora << ":" << this->hora.minuto << endl;
}

void relogio::setHora(horario pHora)
{
    this->hora = pHora;
}

void relogio::getAlarme()
{
    cout << "Alarme definido para " << this->alarme.hora << ":" << this->alarme.minuto << endl;
}
void relogio::setAlarme(horario pHora)
{
    this->alarme = pHora;
}

void relogio::operator++() {
    cout << "Incrementando 1 minuto" << endl;
    if (hora.minuto < 59)
        hora.minuto++;
    else {
        if (hora.hora < 23){
            hora.hora++; //
        }else{
            hora.hora = 0;
        }
        hora.minuto = 0;
    }
    if (hora.hora==alarme.hora && hora.minuto==alarme.minuto)
        cout << "Despertador tocando !!" << endl;
}

relogio::~relogio() {
}

