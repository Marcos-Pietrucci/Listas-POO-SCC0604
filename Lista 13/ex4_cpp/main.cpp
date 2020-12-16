#include <cstdlib>
#include <chrono>
#include <iostream>
#include <vector>
#include<list>
#include<deque>

using namespace std;

template <typename Iterator>
void imprime(Iterator it, int num)
{
    Iterator aux;
    long i;
    for(aux = it, i = 0; i < num; ++aux, i++)
    {
        cout << " " << *aux;
    }
}

template <typename Iterator>
void getMetade(Iterator it, long num)
{
    Iterator aux;
    long i;
    //Acessa os valores, mas não faz nada com eles
    for(aux = it, i = 0; i < num/2 ; ++aux, i++)
    {}
}

int main(int argc, char** argv) {
    
    vector<double> vetor;
    std::list<double> lista;
    deque<double>  dek;
    
    //Variaveis auxiliares
    auto tempo = chrono::steady_clock::now();
    long i, num = 1000000;
    
    //Adicionando varios numeros ao vector
    for(i = 0; i < num; i++)
    {
        vetor.insert(vetor.begin() + i, rand()%100); 
    }
    
    //Realizar operações com o vector
    imprime(vetor.begin(), num);
    getMetade(vetor.begin(), num);
    auto tempo2 = chrono::steady_clock::now();
    auto diff = tempo2 - tempo;
    cout << "\nVector demorou: " << chrono::duration <double, milli> (diff).count() << " ms\n"; 
    
    /***************************************************************************/
    
    //Adicionando varios numeros a list
    for(i = 0; i < num; i++)
    {
        lista.insert(lista.begin(), rand() % 100); 
    }
    
    //Realizar operações com a list
    imprime(lista.begin(), num);
    getMetade(lista.begin(), num);
    tempo2 = chrono::steady_clock::now();
    diff = tempo2 - tempo;
    cout << "\nList demorou: " << chrono::duration <double, milli> (diff).count() << " ms\n"; 
    
    /***************************************************************************/
    
    //Adicionando varios numeros a deque
    for(i = 0; i < num; i++)
    {
        dek.insert(dek.begin(), rand() % 100); 
    }
    
    //Realizar operações com a list
    imprime(dek.begin(), num);
    getMetade(dek.begin(), num);
    tempo2 = chrono::steady_clock::now();
    diff = tempo2 - tempo;
    cout << "\nDeque demorou: " << chrono::duration <double, milli> (diff).count() << " ms\n"; 
    
    
    return 0;
}

