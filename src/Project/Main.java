/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author For LabTop
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager.openAdminPage();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
