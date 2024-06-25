/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coders.hospital.db.dao;

import com.coders.hospital.db.type.UsersType;
import com.coders.hospital.db.vo.PatientInfoVo;
import com.coders.hospital.db.vo.UsersVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Codersbay
 */
public class PatientInfoDao extends Dao implements DaoList<PatientInfoVo>   {
private static PatientInfoDao patientInfoDao;
  
    private PatientInfoDao(){   
}
    
     public static PatientInfoDao getInstance() {
        if (patientInfoDao == null) {
            patientInfoDao = new PatientInfoDao();
        }
        return patientInfoDao;
    }
    
    @Override
    public List<PatientInfoVo> loadAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(PatientInfoVo piv) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
       //java.sql.Connection con = null;///////
        int count = 0;
        try {
            con = getConnetion();
           
             String sql = "INSERT INTO PATIENT_INFO(ID,FIRST_NAME,FATHER_NAME,MOBILE,EMAIL,USER_ID) VALUES(?,?,?,?,?,?) ";
             ps = con.prepareStatement(sql);
            ps.setInt(1, piv.getId());
            ps.setString(2, piv.getFirstName());
            ps.setString(3, piv.getFatherName());
            ps.setString(4, piv.getMobile());
            ps.setString(5, piv.getEmail());
            ps.setInt(6, piv.getUsersVo().getId());
            count = ps.executeUpdate();
          
        } catch (Exception ex) {
           
        } finally { 
            ps.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public int update(PatientInfoVo piv) throws Exception {

  Connection con = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            con = getConnetion();
            String sql = "UPDATE patient_info SET FIRST_NAME=?,FATHER_NAME=?,MOBILE=?,EMAIL=?,USER_ID=? WHERE ID=? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, piv.getFirstName());
            ps.setString(2, piv.getFatherName());
            ps.setString(3, piv.getMobile());
            ps.setString(4, piv.getEmail());
            ps.setInt(5, piv.getUsersVo().getId());
            ps.setInt(6, piv.getId());
            count = ps.executeUpdate();           
            
        } catch (Exception ex) {
        } finally {
            ps.close();
            closeConnection(con);
        }
        return count;



    }

    @Override
    public int delete(PatientInfoVo piv) throws Exception {
 Connection con = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            con = getConnetion();
            String sql = "DELETE FROM patient_info WHERE ID=? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, piv.getId());
            count=ps.executeUpdate();                             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"");
        } finally {
            ps.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public PatientInfoVo getData(PatientInfoVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PatientInfoVo getDataById(int id) throws Exception {
        Connection con = null;
        PatientInfoVo patientInfoVo = null;
        ResultSet rs = null;
        UsersVo usersVo ;
       
        try {
            con = getConnetion();
            String sql = "SELECT * FROM patient_info WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                patientInfoVo = new PatientInfoVo();
                patientInfoVo.setId(rs.getInt("ID"));
                patientInfoVo.setFirstName(rs.getString("FIRST_NAME"));
                patientInfoVo.setFatherName(rs.getString("FATHER_NAME"));
                patientInfoVo.setMobile(rs.getString("MOBILE"));
                patientInfoVo.setEmail(rs.getString("EMAIL"));
                usersVo = new UsersVo();
                usersVo.setId(rs.getInt("USER_ID"));
                patientInfoVo.setUsersVo(usersVo);
              }
            rs.close();
            ps.close();
        } catch (Exception ex) {
        } finally {
            closeConnection(con);
        }
        return patientInfoVo;
    

    }
    
}
