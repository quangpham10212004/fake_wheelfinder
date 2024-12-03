package main.java.Interact;

import java.sql.SQLException;
import java.util.Scanner;
import main.java.Entity.Database;
import main.java.Entity.Operation;
import main.java.Entity.User;
import main.java.UI.Control.DeleteCarGUI;
import main.java.UI.MainFace.AdminDashboard;

public class DeleteCar implements Operation {

    public void operation(Database database, Scanner sc, User user) {
        DeleteCarGUI delca = new DeleteCarGUI();
        delca.setVisible(true);
        
    }
}
