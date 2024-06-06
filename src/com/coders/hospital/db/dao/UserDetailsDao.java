package com.coders.hospital.db.dao;

import com.coders.hospital.db.vo.UsersDetailsVo;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.util.List;



/**
 *  
 * @author Codersbay
 */

public class UserDetailsDao extends Dao implements DaoList<UsersDetailsVo> {
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
    public List<UsersDetailsVo> loadAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public boolean insert(UsersDetailsVo t) throws Exception {

        Connection con = null;
        try {
            con = getConnetion();
            String sql = "INSERT INTO users_details (user_ID,FIRST_NAME,LAST_NAME ";
            PreparedStatement ps = con.prepareStatement(sql);

        } catch (Exception ex) {
        } finally {
        }
    }

    @Override
    public boolean update(UsersDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(UsersDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsersDetailsVo getData(UsersDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
