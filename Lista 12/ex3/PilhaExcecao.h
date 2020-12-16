/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PilhaExcecao.h
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 15:25
 */

#ifndef PILHAEXCECAO_H
#define PILHAEXCECAO_H

#include <string>

class PilhaExcecao {
public:
    PilhaExcecao();
    std::string getMessage();
    void setMessage( std::string message );
    virtual ~PilhaExcecao();
private:
    std::string message;
};

#endif /* PILHAEXCECAO_H */

