/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ClasseGenerica.h
 * Author: brcol
 *
 * Created on 16 de Dezembro de 2020, 16:56
 */

#ifndef CLASSEGENERICA_H
#define CLASSEGENERICA_H

template < class T >
class ClasseGenerica {
    
    private:
        T dado1;
        T dado2;
     
    public:
        ClasseGenerica( T dado1, T dado2 );
        T getMax();
        T getMin();
        T getSum();
};

template < class T >
ClasseGenerica<T>::ClasseGenerica( T dado1, T dado2 ){
    
    this->dado1 = dado1;
    this->dado2 = dado2;
}

template < class T >
T ClasseGenerica<T>::getMax(){
    
    return (this->dado1) > (this->dado2) ? (this->dado1) : (this->dado2);
}

template < class T >
T ClasseGenerica<T>::getMin(){
    
    return (this->dado1) < (this->dado2) ? (this->dado1) : (this->dado2);
}

template < class T >
T ClasseGenerica<T>::getSum(){

    return (this->dado1) + (this->dado2);
}

#endif /* CLASSEGENERICA_H */

