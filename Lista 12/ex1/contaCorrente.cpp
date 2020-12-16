/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   contaCorrente.cpp
 * Author: marco
 * 
 * Created on 15 de Dezembro de 2020, 21:06
 */

#include "contaCorrente.h"

contaCorrente::contaCorrente(long saldo) {
    
    this->saldo = saldo;
}

void contaCorrente::deposita(int valor)
{
    long temp = 0;
    temp = saldo + valor;
    this->saldo = temp;
}
   
void contaCorrente::saca(int valor)
{
    long temp = 0;
    temp = saldo - valor;
    this->saldo = temp;
}

void contaCorrente::fazDepositos(int operacoes)
{
    int i;
    
    /** MODO SEM PARALELISMO **/
    /*
    token.lock();
    for(i = 0 ; i < operacoes ; i++)
        this->deposita(1);
    token.unlock();
     */
    
    /*** MODO DE PARALELISMO MÉDIO ***/ 
    /*
    for(i = 0 ; i < operacoes ; i++)
        this->deposita(1);
    */
    
    /** MODO DE MAIOR PARALELISMO **/
    token.lock();
    for(i = 0 ; i < operacoes/2 ; i++)
        this->deposita(1);
    token.unlock();
    token.lock();
    for(i = 0 ; i < operacoes/2 ; i++)
        this->deposita(1);
    token.unlock();
}

void contaCorrente::fazSaques(int operacoes)
{
    int i;
    
    /** MODO SEM PARALELISMO **/
    /*
    token.lock();
    for(i = 0 ; i < operacoes ; i++)
        this->saca(1);
    token.unlock();
     * */
    
    /*** MODO DE PARALELISMO MÉDIO ***/
    /*
    for(i = 0 ; i < operacoes ; i++)
        this->saca(1);
     */
    
    /** MODO DE MAIOR PARALELISMO **/
    token.lock();
    for(i = 0 ; i < operacoes/2 ; i++)
        this->saca(1);
    token.unlock();
    token.lock();
    for(i = 0 ; i < operacoes/2 ; i++)
        this->saca(1);
    token.unlock();
}

int contaCorrente::getValor()
{
    return this->saldo;
}

contaCorrente::~contaCorrente() {
}

