package ex2;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author brcol
 */
public class FiltroNomeArquivo implements FilenameFilter {
    
    private String tipo;
    
    public FiltroNomeArquivo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        //Devemos receber um arquivo
        if(dir.isFile()) {
            //Deve ter a terminacao desejada
            if(name.endsWith(tipo)) {
                return true;
            }
        }
        
        //Caso essas duas condicoes nao sejam satisfeitas, retornamos falso
        return false;
    }
}
