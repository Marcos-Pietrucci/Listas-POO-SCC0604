package ObjetosEscritorio;

import Execucao.Executavel;
import java.io.Serializable;

/**
 *
 * @author brcol
 */
public class Impressora implements Executavel, Serializable{
    
    private int numPaginas;
    
    public Impressora(){
        numPaginas = 0;
    }
    
    public int getNumPaginas(){
        return numPaginas;
    }
    
    public void setNumPaginas(int n){
        numPaginas = n;
    }
    
    @Override
    public void fazer(){
        System.out.println("Imprimindo " + numPaginas + " paginas...");
        System.out.println("Paginas impressas com sucesso!"); 
    }
    
}
