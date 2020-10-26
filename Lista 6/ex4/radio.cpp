/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radio.cpp
 * Author: Montanari
 * 
 * Created on 25 de Outubro de 2020, 21:40
 */

#include "radio.h"
#include <iostream>
using namespace std;
radio::radio() {
    this->ligado = false;
}

void radio::liga()
{
    this->ligado = true;
    cout << "Radio ligado" << endl;
}

void radio::desliga()
{
    this->ligado = false;
    cout << "Radio desligado" << endl;
}

void radio::setFrequencia(double pFreq)
{
    this->freq=pFreq;
    cout << "Frequencia definida em: " << this->freq << endl;
}

void radio::setFaixa(faixa pFaixa)
{
    this->fx = pFaixa;
    if(this->fx == AM){
    cout << "Faixa definida em AM" << endl; 
    }else{
     cout << "Faixa definida em FM" << endl;   
    }
}

radio::~radio() {
}

