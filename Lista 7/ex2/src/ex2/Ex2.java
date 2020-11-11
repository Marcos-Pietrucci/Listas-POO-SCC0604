
package ex2;

public class Ex2 {
    
    public static <TIPO extends Comparable> void InsertionSort(TIPO[] V) throws RuntimeException
    {
        int i, j;
        TIPO temp;
        
        for(j = 1; j < V.length; j++)
        {
            temp = V[j];
            i = j-1;
            while(i > -1 && V[i].compareTo(temp) > 0)
            {
                V[i+1] = V[i];
                i--;
            }
            
            V[i+1] = temp;
        }
    
    }
    
    public static void main(String[] args) {
       
        nomeFrutas[] nom = new nomeFrutas[10];
        int i;
        
        nom[0] = new nomeFrutas("Uva");
        nom[1] = new nomeFrutas("Mamao");
        nom[2] = new nomeFrutas("Abacaxi");
        nom[3] = new nomeFrutas("Melancia");
        nom[4] = new nomeFrutas("Banana");
        nom[5] = new nomeFrutas("Tamarindo");
        nom[6] = new nomeFrutas("Kiwi");
        nom[7] = new nomeFrutas("Abacate");
        nom[8] = new nomeFrutas("Carambola");
        nom[9] = new nomeFrutas("Maca");
        
        
        //Imprimindo antes
        System.out.print("[ ");
        for(i = 0; i < nom.length; i++)
            System.out.print(nom[i].getNome() + " ");
        System.out.print("]\n");
        
        //Ordena o vetor
        try
        {
            InsertionSort(nom);
        }
        catch(RuntimeException e)
        {
            System.out.print("Erro: " + e.getMessage());
        }
        
        //Imprime depois de ordenar
        System.out.print("[ ");
        for(i = 0; i < nom.length; i++)
            System.out.print(nom[i].getNome() + " ");
        System.out.print("]\n");
    }
    
}
