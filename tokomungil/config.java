/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokomungil;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class config {
    private static Connection mysqlconfig;
    public static Connection configDB(){
    
    //method sistem koneksi
    
            Connection conn = null; 
        Connection connection;
        try{
            
            
            String url = "jdbc:mysql://localhost:3306/toko_mungil";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection (url,user,pass);
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e){
            System.err.println("koneksi gagal"+e.getMessage());
            
        }
        return mysqlconfig;
    }}
        
        
    

        
    

