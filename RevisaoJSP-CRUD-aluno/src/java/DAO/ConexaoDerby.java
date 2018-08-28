/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caiovosilva
 */
public class ConexaoDerby {
    
    private ConexaoDerby(){
    }
    
    public static ConexaoDerby getInstance(){
        if(conexaoDerby == null)
            conexaoDerby = new ConexaoDerby();
        return conexaoDerby;
    }
    
    public Connection getConnection(){
        try {          
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/ALUNO","caio","1234");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDerby.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    private Connection conn;
    private static ConexaoDerby conexaoDerby;
}
