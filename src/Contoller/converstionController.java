/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author For LabTop
 */
public class converstionController implements Initializable {

    @FXML
    private Button butLogout;
    @FXML
    private TextField txtusd;
    @FXML
    private TextField txtnis;
    @FXML
    private Button butConvert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void butLogouthandel(ActionEvent event) {
       System.exit(0);
    }
    

    @FXML
    private void butConverthandel(ActionEvent event) {
       
       if(txtnis.getText().length() > 0){
           double nis = Double.parseDouble(txtnis.getText());
           double reslutUSD = nis/3.63;
           txtusd.setText(Double.toString(reslutUSD));
       }else  if(txtusd.getText().length() > 0){
           double usd = Double.parseDouble(txtusd.getText());
           double reslutNIS = usd/3.63;
           txtusd.setText(Double.toString(reslutNIS));
       }else{
           
       }
        
    }
    
}
