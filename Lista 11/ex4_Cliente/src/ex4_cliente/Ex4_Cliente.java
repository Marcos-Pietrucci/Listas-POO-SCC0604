package ex4_cliente;

import ObjetosEscritorio.*;
import Execucao.Executavel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brcol
 */
public class Ex4_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Executavel> lista = new ArrayList();
        
        try {
            Socket Cliente_Socket = new Socket("localhost", 8008);

            ObjectOutputStream Envia_Objeto = new ObjectOutputStream( Cliente_Socket.getOutputStream() );
            BufferedReader Recebe = new BufferedReader( new InputStreamReader( Cliente_Socket.getInputStream() ) );
            
            /**
             * Deixando o usuario estabelecer as configurações dos aparelhos
            */
            
            //Criando os aparelhos
            Impressora i = new Impressora();
            ArCondicionado a = new ArCondicionado();
            
            //Leitura de dados
            Scanner ler = new Scanner(System.in);
            int nPaginas;
            double temperatura;
            String strTemp;
            
            System.out.println("Voce possui uma impressora e um ar condicionado no seu escritorio.");
            System.out.println("Quantas paginas deseja imprimir?");
            nPaginas = ler.nextInt();
            
            ler.nextLine(); //Limpando buffer
            
            System.out.println("Em que temperatura (ºC) deseja configurar o ar condicionado?");
            strTemp = ler.nextLine();
            
            temperatura = Double.parseDouble(strTemp.replace(',', '.'));
            
            //Configurando dispositivos
            i.setNumPaginas(nPaginas);
            a.setTemperatura(temperatura);
            
            //Esperando o usuario permitir o envio dos dados
            boolean enviar = false;
            String resposta = "n";
            
            while(!enviar){
                System.out.println("Deseja enviar os dados agora? (s/n)");
                resposta = ler.nextLine();
                
                if(resposta.equals("s"))
                    enviar = true;
            }
            
            //Adicionando na lista de executavel
            lista.add(i);
            lista.add(a);
            
            for(Object o : lista){
               Envia_Objeto.writeObject(o);
               System.out.println(Recebe.readLine());
            }
            Envia_Objeto.writeObject(null); //Finalizando o processo

            Envia_Objeto.close();
            Recebe.close();
            Cliente_Socket.close();     
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
