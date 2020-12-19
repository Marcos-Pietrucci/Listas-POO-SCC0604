/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   saldoInsuficiente.h
 * Author: Montanari
 *
 * Created on 19 de Dezembro de 2020, 02:17
 */

#ifndef SALDOINSUFICIENTE_H
#define SALDOINSUFICIENTE_H

#include <stdexcept>

using namespace std;

class saldoInsuficiente  : public runtime_error {
public:
    saldoInsuficiente();
    virtual ~saldoInsuficiente();
private:

};

#endif /* SALDOINSUFICIENTE_H */

