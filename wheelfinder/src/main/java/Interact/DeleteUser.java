package main.java.Interact;

import java.sql.SQLException;
import java.util.Scanner;

import main.java.UI.Control.DeleteUserGUI;
import main.java.Entity.Database;
import main.java.Entity.Operation;
import main.java.Entity.User;

public class DeleteUser implements Operation{
    public void operation(Database database, Scanner sc, User user){
    DeleteUserGUI deluser = new DeleteUserGUI(database, sc, user);
        deluser.setVisible(true);
        
    }
}
