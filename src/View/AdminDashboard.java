/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author For LabTop
 */
public class AdminDashboard extends Stage{
    
    private Scene loginScene;
    private Scene converstionScene;

    public AdminDashboard() throws IOException {
        
        
        FXMLLoader loginloader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent login  = loginloader.load();
        loginScene= new Scene(login);
        
        FXMLLoader converstionloader = new FXMLLoader(getClass().getResource("Converstion .fxml"));
        Parent converstion  = loginloader.load();
        converstionScene= new Scene(login);
        
        this.setScene(loginScene);
        this.setTitle("Login");
    }
    
    public void changeSceneToConverstion(){
        this.setScene(converstionScene);
    }
    
   
    
}
