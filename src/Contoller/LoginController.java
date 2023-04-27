package Contoller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.AdminDashboard;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author For LabTop
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView imageView;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button butLogin;

     @FXML
    private Label labelError;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image image = new Image(getClass().getResourceAsStream("/Image/logpng.png"));
        imageView.setImage(image);
         
    }    

    @FXML
    private void txtUserName(ActionEvent event) {
    }

    @FXML
    private void txtPassword(ActionEvent event) {
    }

    @FXML
    private void butLoginHandel(ActionEvent event) throws IOException {
        if(txtUserName.getText().equals("moad") &&
                        txtPassword.getText().equals("123456")){
                    labelError.setText("Valid User");
                    new AdminDashboard().changeSceneToConverstion();
                                  }  
                else
                    labelError.setText("Invalid ");
        
    }
    
}
