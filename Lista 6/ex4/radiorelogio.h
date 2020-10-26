/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radiorelogio.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 21:40
 */

#ifndef RADIORELOGIO_H
#define RADIORELOGIO_H

#include "radio.h"
#include "relogio.h"

class radiorelogio : public radio, public relogio {
public:
    radiorelogio();
    void setAlarme(horario,double);
    virtual ~radiorelogio();
private:
    double e;
};

#endif /* RADIORELOGIO_H */

