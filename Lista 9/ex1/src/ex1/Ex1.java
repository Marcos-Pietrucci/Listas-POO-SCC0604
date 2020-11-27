package ex1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author brcol
 */
public class Ex1 {
    
    public static void listaArquivos(String path) {
        File file = new File(path);
        
        //Conferindo se o path nos levou a um diretorio/pasta
        if(file.isDirectory()) {
            //Listando os arquivos do diretoria/pasta
            File[] files = file.listFiles();
            
            if(files != null) {
                for(File aux : files) {
                    try{
                        //Caso acessemos um diretorio/pasta
                        if(aux.isDirectory()) {
                            listaArquivos(aux.getCanonicalPath());
                        }
                        //Caso acessemos um arquivo, imprimimos o conteudo
                        else {
                            System.out.println(aux.getName());
                        }
                    }catch(IOException e){
                        System.out.println("ERRO: " + e.getMessage());
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        /***MUDAR O PATH CONFORME SEU COMPUTADOR!!!***/
        listaArquivos("C:\\Users\\brcol\\Downloads");
    }
    
}
