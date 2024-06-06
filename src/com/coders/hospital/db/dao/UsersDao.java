package com.coders.hospital.db.dao;

import com.coders.hospital.db.type.UsersType;
import com.coders.hospital.db.vo.UsersVo;
import com.mysql.cj.xdevapi.PreparableStatement;

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
    public boolean insert(UsersVo uv) throws Exception {
       Connection con = null;
        boolean isInsert=false;
        try {
            con = getConnetion();
            String sql = "INSERT INTO users(USER_NAME,PASSWORD,USER_TYPE VALUES(?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uv.getUsername());
            ps.setString(2, uv.getPassword());
            ps.setInt(3, uv.getUsersType().getId());
            isInsert= ps.execute();
            ps.close();
        }catch (Exception ex) {
        } finally {
            closeConnection(con);
        }

        return isInsert;
    }

    @Override
    public boolean update(UsersVo uv) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(UsersVo uv) throws Exception {
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
        } finally {
            closeConnection(con);
        }
        return usersVo;
    }
}