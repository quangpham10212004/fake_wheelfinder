/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.UI.Control;

import main.java.Entity.Database;
import main.java.Entity.User;

public interface Operation {
    void operation(Database database, User user);
}

