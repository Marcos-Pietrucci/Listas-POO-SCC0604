/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author brcol
 */
public class ex3Controller implements Initializable {
    
    @FXML
    private TextField x; //Primeiro operando
    
    @FXML
    private TextField y; //Segundo operando
    
    @FXML
    private Label operacao;
    
    @FXML
    private Label resposta;
    
    @FXML
    private Button soma;
    
    @FXML
    private Button subtracao;
    
    @FXML
    private Button multiplicacao;
    
    @FXML
    private Button divisao;
    
    //Variaveis auxiliares para fazermos os cálculos a partir do conteúdo presente nas TextFields
    int pX;
    int pY;
    String result; //Resultado das operações
    
    //Objeto da classe Calculadora
    Calculadora calc = new Calculadora();
    
    @FXML
    private void somar(ActionEvent event) {
        if (!x.getText().equals("") && !y.getText().equals("")) {
            
            //Mudando Label de operacao
            operacao.setText("+");
            
            //Convertendo conteúdo de TextField em int
            pX = Integer.parseInt(x.getText());
            pY = Integer.parseInt(y.getText());
            
            //Calculando resposta e convertendo para String
            result = Integer.toString(calc.soma(pX, pY));
            
            //Mudando Label de resposta
            resposta.setText(result);
            
        }else {
            Alert mensagem = new Alert(Alert.AlertType.ERROR);
            mensagem.setTitle("ERRO");
            mensagem.setContentText("Entradas não preenchidas!");
            mensagem.setHeaderText(null);
            mensagem.showAndWait();
        }
        
    }
    
    @FXML
    private void subtrair(ActionEvent event) {
        if (!x.getText().equals("") && !y.getText().equals("")) {
            
            //Mudando Label de operacao
            operacao.setText("-");
            
            //Convertendo conteúdo de TextField em int
            pX = Integer.parseInt(x.getText());
            pY = Integer.parseInt(y.getText());
            
            //Calculando resposta e convertendo para String
            result = Integer.toString(calc.subtracao(pX, pY));
            
            //Mudando Label de resposta
            resposta.setText(result);
            
        }else {
            Alert mensagem = new Alert(Alert.AlertType.ERROR);
            mensagem.setTitle("ERRO");
            mensagem.setContentText("Entradas não preenchidas!");
            mensagem.setHeaderText(null);
            mensagem.showAndWait();
        }
        
    }
    
    @FXML
    private void multiplicar(ActionEvent event) {
        if (!x.getText().equals("") && !y.getText().equals("")) {
            
            //Mudando Label de operacao
            operacao.setText("*");
            
            //Convertendo conteúdo de TextField em int
            pX = Integer.parseInt(x.getText());
            pY = Integer.parseInt(y.getText());
            
            //Calculando resposta e convertendo para String
            result = Integer.toString(calc.multiplicacao(pX, pY));
            
            //Mudando Label de resposta
            resposta.setText(result);
            
        }else {
            Alert mensagem = new Alert(Alert.AlertType.ERROR);
            mensagem.setTitle("ERRO");
            mensagem.setContentText("Entradas não preenchidas!");
            mensagem.setHeaderText(null);
            mensagem.showAndWait();
        }
        
    }
    
    @FXML
    private void dividir(ActionEvent event) {
        if (!x.getText().equals("") && !y.getText().equals("")) {
            
            //Mudando Label de operacao
            operacao.setText("/");
            
            //Convertendo conteúdo de TextField em int
            pX = Integer.parseInt(x.getText());
            pY = Integer.parseInt(y.getText());
            
            //Calculando resposta e convertendo para String
            //Verificando divisão por zero (0)
            try{
                result = Double.toString(calc.divisao(pX, pY));
                
                //Mudando Label de resposta
                resposta.setText(result);
                
            } catch(java.lang.ArithmeticException e) {
                
                Alert mensagem = new Alert(Alert.AlertType.ERROR);
                mensagem.setTitle("ERRO");
                mensagem.setContentText("Math Error: não é possível dividir por zero.");
                mensagem.setHeaderText(null);
                mensagem.showAndWait();
            }
            
        }else {
            Alert mensagem = new Alert(Alert.AlertType.ERROR);
            mensagem.setTitle("ERRO");
            mensagem.setContentText("Entradas não preenchidas!");
            mensagem.setHeaderText(null);
            mensagem.showAndWait();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x.textProperty().addListener(
            new ChangeListener<String>() {
            @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) {
                        x.setText(newValue.replaceAll("[^\\d]", ""));
                    }
                }
            }
        );
        
        y.textProperty().addListener(
            new ChangeListener<String>() {
            @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) {
                        y.setText(newValue.replaceAll("[^\\d]", ""));
                    }
                }
            }
        );
    }    
    
}
