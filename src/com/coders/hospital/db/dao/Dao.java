package com.coders.hospital.db.dao;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Codersbay
 */
public class Dao {
    public Connection getConnetion() throws Exception{
         Class.forName("con.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://loclahost/hospital_system","root","sadb");
      
        
    }
}
