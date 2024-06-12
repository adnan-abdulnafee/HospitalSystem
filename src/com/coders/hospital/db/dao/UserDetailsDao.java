package com.coders.hospital.db.dao;

import com.coders.hospital.db.vo.UserDetailsVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author Codersbay
 */
public class UserDetailsDao extends Dao implements DaoList<UserDetailsVo> {

    private static UserDetailsDao userDetailsDao;
    
       private UserDetailsDao() {
    }


    public static UserDetailsDao getInstance() {
        if (userDetailsDao == null) {
            userDetailsDao = new UserDetailsDao();
        }
        return userDetailsDao;
    }
 

    @Override
    public List<UserDetailsVo> loadAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public int insert(UserDetailsVo udv) throws Exception {
        
        Connection con = null;
        PreparedStatement ps = null;
        
       //java.sql.Connection con = null;///////
        int count = 0;
        try {
            con = getConnetion();
            con.setAutoCommit(false);
             String userSql = "INSERT INTO users(USER_NAME,PASSWORD,USER_TYPE,ID) VALUES(?,?,?,?) ";
             ps = con.prepareStatement(userSql);
            ps.setString(1, udv.getUsersVo().getUsername());
            ps.setString(2, udv.getUsersVo().getPassword());
            ps.setInt(3, udv.getUsersVo().getUsersType().getId());
            ps.setInt(4, udv.getUsersVo().getId());
            ps.executeUpdate();
            String userDetailsSql = "INSERT INTO users_details(USER_ID,FIRST_NAME,FATHER_NAME,MOBILE) VALUES ( ?,  ?,  ?,  ?)";
             ps = con.prepareStatement(userDetailsSql);
            ps.setInt(1, udv.getUsersVo().getId());
            ps.setString(2, udv.getFirstName());
            ps.setString(3, udv.getFatherName());
            ps.setString(4, udv.getMobile());
             ps.executeUpdate();
             con.commit();
             count=1;
        } catch (Exception ex) {
            con.rollback();
        } finally { 
            ps.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public int update(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDetailsVo getData(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
