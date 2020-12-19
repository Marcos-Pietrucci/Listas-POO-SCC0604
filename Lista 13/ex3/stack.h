/* 
 * File:   stack.h
 * Author: Montanari
 *
 * Created on 19 de Dezembro de 2020, 12:56
 */

#ifndef STACK_H
#define STACK_H

#include <iostream>
#include <deque>
#include <stdexcept>

using namespace std;

template <class T, int N=1, class C=deque<T>>
class stack{
    private:
        C *con;
    public:

        stack() {
            con = new C();
        }

        ~stack() {
            cout << "Desfazendo pilha..." << endl;
            delete con;
        }
        void insert(const T &elem);
        int size() const;
        T top() const;
        T remove();
        void clear() const;
        void resize(int);
};


template <class T,int N, class C>
void stack<T,N,C>::insert(const T &elem){
    if(size() == N)
        throw runtime_error("Pilha está cheia!");
                
    con->push_back(elem);
}

template <class T,int N, class C>
int stack<T,N,C>::size() const{
    return con->size();
}

template <class T,int N,class C>
T stack<T,N,C>::top() const{
    if (size() == 0)
        throw runtime_error("Pilha está vazia!");
    return con->back();
}

template <class T,int N,class C>
T stack<T,N,C>::remove(){
    if (size()==0)
        throw runtime_error("Pilha está vazia!");
    T aux = con->back();
    con->pop_back();
    return aux;
}

template <class T,int N,class C>
void stack<T,N,C>::clear() const{
    con->clear();
}

template <class T,int N,class C>
void stack<T,N,C>::resize(int size){
    con->resize(size);
}
#endif /* STACK_H */

