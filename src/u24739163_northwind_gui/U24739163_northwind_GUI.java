/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u24739163_northwind_gui;

import java.util.logging.Level;
import java.util.logging.Logger;

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
                x.setVisible(true);
        /*try {
            // TODO code application logic here

            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/u24739163_northwind", "root", "4659");
                System.out.println("Database connected");
                
                Statement stmt = conn.createStatement();
                String sqlText;
                sqlText = "SELECT * "
                        + "FROM customers";
                System.out.println(sqlText);
                stmt.executeQuery(sqlText);
        } catch (ClassNotFoundException ex) {
            System.out.println("ex" + ex);
        } catch (SQLException ex) {
            System.out.println("ex" + ex);
        }*/
    }
    
}
