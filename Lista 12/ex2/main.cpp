#include <cstdlib>
#include <thread>
#include <iostream>

#include "contaCorrente.h"
using namespace std;


int main(int argc, char** argv) 
{
    contaCorrente *conta = new contaCorrente(0);
    
    cout << "Saldo inicial:" << conta->getValor() << endl;
    
    cout << "Fazendo depósito negativo..." << endl;
    thread *t1 = new thread(&contaCorrente::fazDepositos, conta, -1);
    
    //Espera o depósito ocorrer
    t1->join();
    
    cout << "Fazendo saque sem saldo..." << endl;
    thread *t2 = new thread(&contaCorrente::fazSaques, conta, 50000);
    
    //Espera o saque ocorrer
    t2->join();
    
    cout << "Temos o valor: " << conta->getValor() << endl;
    
    delete(t1);
    delete(t2);
    delete(conta);
    
    
    return 0;
}

