


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eryco
 */
import java.sql.*;
import javax.swing.*;
public class connectdb{
public static final String user="root";
public static final String pass="";
public static final String DB="jdbc:mysql://localhost:3306/knh";

public static Connection myconnect(){
    Connection con=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection(DB,user,pass);
    
    return con; 
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
   }
}
}