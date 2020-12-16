/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PilhaExcecao.cpp
 * Author: brcol
 * 
 * Created on 16 de Dezembro de 2020, 15:25
 */

#include "PilhaExcecao.h"

PilhaExcecao::PilhaExcecao() {
}

std::string PilhaExcecao::getMessage(){
    return message;
}

void PilhaExcecao::setMessage( std::string message ){
    this->message = message;
}

PilhaExcecao::~PilhaExcecao() {
}

