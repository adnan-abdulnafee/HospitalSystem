package com.coders.hospital.db.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * @author Codersbay
 */
public class Dao {
    public Connection getConnetion() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_system", "root", "sadb");
        if (con != null) {
//            JOptionPane.showMessageDialog(null, "connect");
            return con;
        }

        return null;
    }

    public void closeConnection(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }

    }


//
//    public static void   main(String a[]) throws
//
//    Exception {
//        getConnetion();
//    }
}