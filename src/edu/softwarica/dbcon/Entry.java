/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica.dbcon;

import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public interface Entry {
    int insert(NameEntry nameentry) throws ClassNotFoundException,SQLException;
    
}
