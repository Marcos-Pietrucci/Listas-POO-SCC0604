/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Montanari
 *
 * Created on 25 de Outubro de 2020, 19:46
 */

#include <cstdlib>

#include "radiorelogio.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    relogio r;
    horario nHora = {10,30};
    r.setHora(nHora);
    horario nAlarme = {10,32};
    r.setAlarme(nAlarme);
    r.getHora();
    r.getAlarme();
    ++r;
    r.getHora();
    ++r;
    
    radio ra;
    ra.liga();
    ra.setFaixa(FM);
    ra.setFrequencia(1200);
    ra.setFaixa(AM);
    ra.setFrequencia(1300);
    ra.desliga();
    
    radiorelogio rr;
    rr.liga();
    rr.setHora(nHora);
    rr.setAlarme(nAlarme,1500);
    rr.getHora();
    rr.getAlarme();
    ++rr;
    rr.getHora();
    ++rr;
    rr.setFaixa(FM);
    rr.setFrequencia(1250);
    rr.setFaixa(AM);
    rr.setFrequencia(1350);
    rr.desliga();
    
      
    return 0;
}

