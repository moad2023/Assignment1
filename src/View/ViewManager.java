/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author For LabTop
 */
public class ViewManager {
       public static AdminDashboard adminPage;

    public ViewManager() {
    }

    public static void openAdminPage() throws IOException {
        if (adminPage == null) {
            adminPage = new AdminDashboard();
            adminPage.show();
        } else {
            adminPage.show();
        }

    }
     public static void closeAdminPage(){
        if(adminPage != null)
            adminPage.close();
    }

}
