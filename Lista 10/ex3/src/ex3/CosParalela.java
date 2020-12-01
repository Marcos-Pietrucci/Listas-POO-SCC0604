/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Random;

/**
 *
 * @author marco
 */
public class CosParalela implements Runnable{
    
    private int nCores;
    private long numero_calculos;
    
    CosParalela(int nCores, long numero_calculos)
    {
        this.nCores = nCores;
        this.numero_calculos = numero_calculos;
    }
    
    @Override
    public void run()
    {
        Random ra = new Random();
        double num;
        int i;
        
        for(i = 0; i < numero_calculos/nCores; i++)
        {
            num = 1 + 99*ra.nextDouble();
            Math.cos(num);
        }
    }    
}
