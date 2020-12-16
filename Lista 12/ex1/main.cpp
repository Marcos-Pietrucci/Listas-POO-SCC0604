#include <cstdlib>
#include <thread>
#include <iostream>

#include "contaCorrente.h"
using namespace std;


int main(int argc, char** argv) 
{
    contaCorrente *conta = new contaCorrente(0);
    
    thread *t1 = new thread(&contaCorrente::fazDepositos, conta, 50000);
    thread *t2 = new thread(&contaCorrente::fazSaques, conta, 50000);
    
    t1->join();
    t2->join();
    
    cout << "Temos o valor: " << conta->getValor();
    
    delete(t1);
    delete(t2);
    delete(conta);
    
    return 0;
}

