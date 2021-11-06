/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritocompras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author micky
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conexion = null;
        
        try {
            conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/carritoCompras","root","pass");
            
            if(conexion != null){
                System.out.println("Conexion exitosa");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return conexion;
    }
    
}
