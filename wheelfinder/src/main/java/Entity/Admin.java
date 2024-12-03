
package main.java.Entity;

import java.util.Scanner;
import main.java.Interact.AddNewAccount;
import main.java.Interact.AddNewCar;
import main.java.Interact.ChangePassword;
import main.java.Interact.DeleteCar;
import main.java.Interact.DeleteUser;
import main.java.Interact.Quit;
import main.java.Interact.ShowUserBuys;
import main.java.Interact.UpdateCar;
import main.java.Interact.ViewAllUser;
import main.java.Interact.ViewCar;
import main.java.UI.MainFace.AdminDashboard;


public class Admin extends User {
    private Operation[] operations = new Operation[] { new AddNewCar(),
        new ViewCar(),new UpdateCar(),new DeleteCar(),new AddNewAccount(1),
        new ShowUserBuys(),new ChangePassword(),new ViewAllUser(), new DeleteUser(), new Quit()}; // 1 phan tu duy nhat


    public Admin(){
        super();
    }
    
    public void showList(Database database , Scanner sc){
        new AdminDashboard();
        new AdminDashboard().setVisible(true);  
    }
}
