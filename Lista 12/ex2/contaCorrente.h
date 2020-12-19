/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   contaCorrente.h
 * Author: marco
 *
 * Created on 15 de Dezembro de 2020, 21:06
 */

#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

#include <mutex>
#include <iostream>

class contaCorrente {
public:
    contaCorrente(long saldo);
    void deposita(int valor);   //Credita 'valor' no saldo
    void saca(int valor);       //Debita 'valor' no saldo
    void fazDepositos(int operacoes);   //Faz 'operacoes' depositos
    void fazSaques(int operacoes);  //Faz 'operacoes' saques
    int getValor();
    virtual ~contaCorrente();
    
private:
    std::mutex token;
    long saldo;
};

#endif /* CONTACORRENTE_H */

