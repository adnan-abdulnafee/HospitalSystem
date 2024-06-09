package com.coders.hospital.db.dao;

import com.coders.hospital.db.vo.UserDetailsVo;
import com.sun.jdi.connect.spi.Connection;
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
        java.sql.Connection con = null;///////
        int count = 0;
        try {
            con = getConnetion();
            String sql = "INSERT INTO users_details (USERS_ID,FIRST_NAME,FATHER_NAME;MOBILE)VALUES( ?,  ?,  ?,  ?) ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, udv.getUsersVo().getId());
            ps.setString(2, udv.getFirstName());
            ps.setString(3, udv.getFatherName());
            ps.setString(4, udv.getMobile());
            count = ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
        } finally {
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
