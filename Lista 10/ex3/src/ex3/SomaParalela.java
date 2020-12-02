/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author marco
 */
public class SomaParalela implements Runnable{
    
    
    private long numero_calculos;
    private int nCores;
    
    SomaParalela(int nCores, long numero_calculos)
    {
        this.numero_calculos = numero_calculos;
        this.nCores = nCores;
    }
    
    @Override
    public void run()
    {
        long i;
        long num = 0;
        
        for(i = 0; i < numero_calculos/nCores; i++)
        {
            num++;
        }    
    }
    
}
