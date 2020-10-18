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
public class Lista5Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DynamicVec vec = new DynamicVec(10);
        vec.print();
        vec.fillAll();
        vec.print();
        
        int[] casoTeste = {-1,1,5,450};
        
        for(int i=0;i<4;i+=2){
            try{
                vec.fillPos(casoTeste[i], casoTeste[i+1]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        
        vec.print();

    }
    
}
