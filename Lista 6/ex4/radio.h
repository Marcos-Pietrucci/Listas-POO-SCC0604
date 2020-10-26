/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radio.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 21:40
 */

#ifndef RADIO_H
#define RADIO_H

enum faixa {AM,FM};
class radio {
public:
    radio();
    void setFrequencia(double);
    void setFaixa(faixa);
    void liga();
    void desliga();
    virtual ~radio();
protected:
    bool ligado;
    double freq;
    faixa fx;
    
    

};

#endif /* RADIO_H */

