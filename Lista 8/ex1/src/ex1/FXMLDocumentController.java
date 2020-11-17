/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


/**
 *
 * @author marco
 */
public class FXMLDocumentController implements Initializable {
     
    private Polinomio polinomio = new Polinomio();
    
    @FXML
    private TextField txtNumero;
            
    @FXML
    private TextField txtCoef;
    
    @FXML
    private TextField txtGrau;
    
    @FXML
    private Label lblResultado;
    
    @FXML
    private Label lblPolinomio;
    
    @FXML
    private Button btnInserir;
    
    @FXML
    private Button btnCalcular;
    
    @FXML
    private void btnInserirClick(ActionEvent event) {
        
        double coef = Double.parseDouble(txtCoef.getText());
        int grau = (int) Double.parseDouble(txtGrau.getText());
        
        this.polinomio.Add(coef, grau);
        
        lblPolinomio.setText("P(x) = " + polinomio.Mostra());
    }
    
    @FXML
    private void btnCalcularClick(ActionEvent event) {
        
        double valor = Double.parseDouble(txtNumero.getText());
        
        valor = polinomio.Calcula(valor);
        
        String strValor = ""+valor;
        
        lblResultado.setText(strValor);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
