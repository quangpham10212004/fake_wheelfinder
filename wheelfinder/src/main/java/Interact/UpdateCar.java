package main.java.Interact;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import main.java.Entity.Car;
import main.java.Entity.Database;
import main.java.Entity.Operation;
import main.java.Entity.User;
import main.java.UI.Control.UpdateCarGUI;


public class UpdateCar implements Operation{
    public void operation(Database database, Scanner sc, User user){
       new UpdateCarGUI();
    }
}
