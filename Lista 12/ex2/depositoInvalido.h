/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   depositoInvalido.h
 * Author: Montanari
 *
 * Created on 19 de Dezembro de 2020, 02:17
 */

#ifndef DEPOSITOINVALIDO_H
#define DEPOSITOINVALIDO_H

#include <stdexcept>

using namespace std;

class depositoInvalido : public runtime_error{
public:
    depositoInvalido();
    virtual ~depositoInvalido();
private:

};

#endif /* DEPOSITOINVALIDO_H */

