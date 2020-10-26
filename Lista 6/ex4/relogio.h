/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   relogio.h
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 21:40
 */

#ifndef RELOGIO_H
#define RELOGIO_H

struct horario { 
    int hora; 
    int minuto;
};

class relogio {
public:
    relogio();
    void getHora();
    void setHora(horario);
    void setAlarme(horario);
    void getAlarme();
    void operator++();
    virtual ~relogio();
protected:
    horario hora;
    horario alarme;

};

#endif /* RELOGIO_H */

