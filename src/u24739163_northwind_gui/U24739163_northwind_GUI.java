/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u24739163_northwind_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author makha
 */
public class U24739163_northwind_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        northwind_GUI x = new northwind_GUI();
                x.loadData(null);
                x.loadProducts();
                x.loadNotifications();
                x.setVisible(true);
        
    }
    
}
