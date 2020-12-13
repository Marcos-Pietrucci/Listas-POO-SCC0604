/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_servidor;
import Execucao.TesteDeExecucao;
import ObjetosEscritorio.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author brcol
 */
public class Servidor extends TesteDeExecucao{
    
    public Servidor(){
        
    }
    
    public void rodar(){
        try {
            ServerSocket Receptor = new ServerSocket(8008);
            Socket Servidor_Socket = Receptor.accept();

            ObjectInputStream Recebe_Objeto = new ObjectInputStream(Servidor_Socket.getInputStream());

            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(Servidor_Socket.getOutputStream()));
            Object oTemp;
            
            //Looop do servidor
            //Recebendo objetos
            do {
                oTemp = Recebe_Objeto.readObject();
              
                if (oTemp instanceof Impressora) {
                    Impressora i = (Impressora) oTemp;
                    ENVIA.println("Servidor responde: "
                                + "Comando recebido. Impressora configurada para imprimir " 
                                + i.getNumPaginas() + " paginas.");
                    
                    this.testarObjeto(i); //Acionando fazer() do objeto
                }
                
                if (oTemp instanceof ArCondicionado) {
                    ArCondicionado a = (ArCondicionado) oTemp;
                    ENVIA.println("Servidor responde: "
                                + "Comando recebido. Ar condicionado configurado em " 
                                + a.getTemperatura() + " graus Celsius.");
                    
                    this.testarObjeto(a); //Acionando fazer() do objeto
                }
                
                System.out.print("\n");
              
                ENVIA.flush();
                
            } while(oTemp != null);

            Recebe_Objeto.close();
            ENVIA.close();
            Servidor_Socket.close();
            Receptor.close();
            
        } catch (IOException e) {
            System.out.println("Erro de IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro de ClassNotFound: " + e.getMessage());
        }
    }
    
}
