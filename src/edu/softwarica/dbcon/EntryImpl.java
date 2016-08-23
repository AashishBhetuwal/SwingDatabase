/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica.dbcon;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public class EntryImpl implements Entry {

    @Override
    public int insert(NameEntry nameentry) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/newcon", "root", null);
        System.out.println("Connection Succesful");
        String sql="INSERT INTO newtable(name,age) VALUES(?,?)";
        PreparedStatement pr=conn.prepareStatement(sql);
        pr.setString(1, nameentry.getName());
        pr.setInt(2, nameentry.getAge());
        int result=pr.executeUpdate();
        
        
        conn.close();
        return result;
    }
    
}
