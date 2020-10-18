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
public class Lista5Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DynamicMatrix mat = new DynamicMatrix(4,4);
        mat.print();
        mat.fillAll();
        mat.print();
        
        int[] casoTeste = {-1,1,1,1,2,3};
        
        for(int i=0;i<6;i+=3){

            try{
                mat.fillPos(casoTeste[i], casoTeste[i+1], casoTeste[i+2]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println();  
            }
            mat.print();
        }
       
    }
}
