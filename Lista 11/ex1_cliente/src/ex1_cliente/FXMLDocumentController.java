/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 *
 * @author marco
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnEnviar;
    
    @FXML
    private TextArea txtPapo;
    
    @FXML
    private TextArea txtmsg;
    
    
    Socket CLIENTE_SOCKET;

    PrintWriter ENVIA;
    BufferedReader RECEBE;

    
    @FXML
    public void atualiza_chat(String txt)
    {
        try{
        String atual;
        atual = txtPapo.getText();
        txtPapo.setText(atual + "\n" + txt);
        }
        catch(Exception e)
        {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    @FXML
    private void btnEnviarClick(ActionEvent event) {
        
        String userInput = txtmsg.getText();
        
        if(userInput.compareTo("XAU") != 0)
        {
            if(!userInput.isEmpty())
            {    
                ENVIA.println(userInput);
                atualiza_chat("Voce: "+ txtmsg.getText());
            }
        }
        else
            System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try{
            CLIENTE_SOCKET = new Socket("localhost", 8008);

            ENVIA = new PrintWriter(CLIENTE_SOCKET.getOutputStream(), true);
            RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
        }
        catch(IOException e)
        {
            System.out.println("ERRO: "+ e.getMessage());
        }
        
        //Receber as leituras via thread
        Thread t1 = new Thread(new Le_servidor(RECEBE));
        t1.start();
    }    
    
    public class Le_servidor implements Runnable
    {
    
        BufferedReader RECEBE;
    
        public Le_servidor(BufferedReader RECEBE)
        {
            this.RECEBE = RECEBE;
        }
    
        @Override
        public void run()
        {
            while(true)
            {
                try{
                    String entrada = RECEBE.readLine(); 
                    if(!entrada.isEmpty())
                        atualiza_chat("Amigo: " + entrada);
                }
                catch(IOException e)
                {
                    System.out.println("Erro " + e.getMessage());
                }
            }
        }
    
    }
    
}
