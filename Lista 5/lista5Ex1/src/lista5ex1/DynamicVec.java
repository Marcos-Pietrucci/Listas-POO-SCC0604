/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex1;

/**
 *
 * @author Montanari
 */
public class DynamicVec {
    private int size;
    private int[] data;
    
    public DynamicVec(int pSize)
    {
        size = pSize;
        data = new int [size];
        for(int i=0;i<size;i++)
            data[i]=0;
    }
    
    public void fillPos(int i, int v) throws ArrayIndexOutOfBoundsException{
        if(i<0 | i >= size)
            throw new ArrayIndexOutOfBoundsException("Posição invalida");
        data[i] = v;
    }
  
    public void fillAll(){
        for(int i = 0; i < size; i++)
            data[i] = 100*i;
    }
    
    public void print(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(i == size-1){
                System.out.print(data[i]);
            }else{
                System.out.print(data[i] + ",");
            }
        }
        System.out.print("]");
        System.out.println();
        
    }
}
