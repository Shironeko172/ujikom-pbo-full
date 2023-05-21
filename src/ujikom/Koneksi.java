/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujikom;

/**
 *
 * @author Adam Marwadi
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    Connection con;
    Statement st;
    
    public Connection config() {
    try{
        String url="jdbc:mysql://localhost/pbo";
        String user="root";
        String pass="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        con=DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        System.out.println("Bisa Konek");
    }catch (Exception e) {
        JOptionPane.showConfirmDialog(null,"Koneksi Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);
    }
    return con;
    }
    
}
