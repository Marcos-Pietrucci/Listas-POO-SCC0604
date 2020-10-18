/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex2;

/**
 *
 * @author Montanari
 */
public class DynamicMatrix {
    private int rows;
    private int cols;
    private int data[][];
    
    public DynamicMatrix(int pRows, int pCols)
    {
        rows = pRows;
        cols = pCols;
        data = new int [rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                data[i][j] = 0;
    }
    
    public void fillPos(int i, int j, int value) throws ArrayIndexOutOfBoundsException{
        if(i<0 || j<0 || i>=rows || j>= cols)
            throw new ArrayIndexOutOfBoundsException("Posição invalida");
        data[i][j] = value;
    }
    
    public void fillAll()
    {
        for(int i=0; i<rows;i++)
            for(int j=0;j<cols;j++)
                data[i][j]=i+j;
    }
    
    public void print(){
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    
}
