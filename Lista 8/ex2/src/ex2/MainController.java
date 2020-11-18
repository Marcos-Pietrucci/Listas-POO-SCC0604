/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author montanari
 */
public class MainController implements Initializable {
    
    @FXML private ListView<String> listView;
    
    @FXML private TextField tf;
    
    @FXML private Button bPush;
    
    @FXML private Button pPop;
    
    @FXML private Button pOk;
    
    @FXML private TextField tfSize;
    
    @FXML private Button bClear;
    
    
    private Stack st = new Stack();
    
    @FXML
    private void popClick(ActionEvent event)
    {
        if(!tf.getText().equals("")){
            message("Campo não está vazio!",AlertType.ERROR);
        }else{
            try{
                tf.setText(st.pop());
                listView.getItems().remove(0);
            } catch (Stack_Empty e) {
                message(e.getMessage(),AlertType.ERROR);
            }
        }
    }
    
    @FXML
    private void pushClick(ActionEvent event)
    {
        if(tf.getText().equals(""))
        {
            message("Campo está vazio!", AlertType.ERROR);
        }else{
            try{
                st.push(tf.getText());
                listView.getItems().add(0,tf.getText());
                tf.setText("");
            } catch (Stack_Full e) {
                message(e.getMessage(),AlertType.ERROR);
            }
        }
    }
    
    @FXML
    private void okClick(ActionEvent event)
    {
        int size = Integer.parseInt(tfSize.getText());
        if(listView.getItems().size() > size){
            message("Tamanho menor que o número atual de elementos!",AlertType.ERROR);
            tfSize.setText(Integer.toString(st.getSize()));
            return;
        }
        if(size!=st.getSize()){
            st.setSize(size);
            message("Tamanho definido!",AlertType.INFORMATION);
        }
    }
    
    @FXML
    private void message(String ms, AlertType type)
    {
        Alert msg = new Alert(type);
        
        if (type == AlertType.ERROR)
            msg.setTitle("Erro!");
        else
            msg.setTitle("Alerta!");
        
        msg.setContentText(ms);
        msg.setHeaderText(null);
        msg.showAndWait();
            
    }
    

    @FXML
    private void clearClick(ActionEvent event)
    {
        st.clear();
        listView.getItems().clear();
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        st.setSize(3);
        tfSize.textProperty().addListener ((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (!newValue.matches("\\d*")) {
                tfSize.setText(newValue.replaceAll("[^\\d]", ""));
            }
            if (tfSize.getText().length() > 6)
            {
                tfSize.setText(tfSize.getText().substring(0, 6));
            }
        });
        
        tf.textProperty().addListener ((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if (tf.getText().length() > 30)
            {
                tf.setText(tf.getText().substring(0, 30));
            }
        });
        
    }    
    
}
