package com.coders.hospital.db.dao;

import com.coders.hospital.db.type.UsersType;
import com.coders.hospital.db.vo.UsersVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author Codersbay
 */
public class UsersDao extends Dao implements DaoList<UsersVo> {
    private static UsersDao usersDao;

    private UsersDao() {
    }

    public static UsersDao getInstance() {
        if (usersDao == null) {
            usersDao = new UsersDao();
        }
        return usersDao;
    }

    @Override
    public List<UsersVo> loadAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insert() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsersVo getData(UsersVo uv) throws Exception {
        Connection con = null;
        UsersVo usersVo = null;
        ResultSet rs = null;
        try {
            con = getConnetion();
            String sql = "SELECT * FROM users WHERE USER_NAME='" + uv.getUsername() + "' AND PASSWORD='" + uv.getPassword() + "' ";
            PreparedStatement ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                usersVo = new UsersVo();
                usersVo.setId(rs.getInt("id"));
                usersVo.setUsername(rs.getString("user_name"));
                usersVo.setPassword(rs.getString("password"));
                UsersType usersType = UsersType.getUsersTypeById(rs.getInt("USER_TYPE"));
                usersVo.setUsersType(usersType);

            }
            rs.close();
            ps.close();
        } catch (Exception ex) {
        }
        finally {
            closeConnection(con);
        }
        return usersVo;
    }
}
