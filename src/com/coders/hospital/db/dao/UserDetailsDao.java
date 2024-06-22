package com.coders.hospital.db.dao;

import com.coders.hospital.db.type.UsersType;
import com.coders.hospital.db.vo.UserDetailsVo;
import com.coders.hospital.db.vo.UsersVo;
import com.coders.hospital.view.UsersView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

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
            String userDetailsSql = "INSERT INTO users_details(USER_ID,FIRST_NAME,FATHER_NAME,MOBILE,IMAGE,Specialization) VALUES ( ?,  ?,  ?,  ? , ?,?)";
             ps = con.prepareStatement(userDetailsSql);
            ps.setInt(1, udv.getUsersVo().getId());
            ps.setString(2, udv.getFirstName());
            ps.setString(3, udv.getFatherName());
            ps.setString(4, udv.getMobile());
            ps.setBytes(5, udv.getImage());
            ps.setString(6, udv.getSpecialization());
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
    public int update(UserDetailsVo udv) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        //java.sql.Connection con = null;///////
        int count = 0;
        try {
            con = getConnetion();
            con.setAutoCommit(false);
            String userSql = "UPDATE users SET USER_NAME=?,PASSWORD=?,USER_TYPE=? WHERE ID=? ";
            ps = con.prepareStatement(userSql);
            ps.setString(1, udv.getUsersVo().getUsername());
            ps.setString(2, udv.getUsersVo().getPassword());
            ps.setInt(3, udv.getUsersVo().getUsersType().getId());
            ps.setInt(4, udv.getUsersVo().getId());
            ps.executeUpdate();           
            String userDetailsSql = "UPDATE users_details SET FIRST_NAME=?,FATHER_NAME=?,MOBILE=?,IMAGE=? WHERE USER_ID=?";
            ps = con.prepareStatement(userDetailsSql);
            ps.setString(1, udv.getFirstName());
            ps.setString(2, udv.getFatherName());
            ps.setString(3, udv.getMobile());
            ps.setBytes(4, udv.getImage());
            ps.setInt(5, udv.getUsersVo().getId());
            ps.executeUpdate();
            con.commit();
            count = 1;
        } catch (Exception ex) {
            con.rollback();
        } finally {
            ps.close();
            closeConnection(con);
        }
        return count;









    }

    @Override
    public int delete(UserDetailsVo udv) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
       //java.sql.Connection con = null;///////
        int count = 0;
        try {
            con = getConnetion();
            con.setAutoCommit(false);
            String userDetailsSql = "DELETE FROM users_details WHERE USER_ID=? ";
            ps = con.prepareStatement(userDetailsSql);
            ps.setInt(1, udv.getUsersVo().getId());
            ps.executeUpdate();                      
            String userSql = "DELETE FROM USERS WHERE ID=? ";
            ps = con.prepareStatement(userSql);
            ps.setInt(1, udv.getUsersVo().getId());
            ps.executeUpdate();
            
            con.commit();
            count = 1;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"");
           
            con.rollback();
        } finally {
            ps.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public UserDetailsVo getData(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDetailsVo getDataById(int id) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        //java.sql.Connection con = null;///////
        ResultSet rs = null;
        UserDetailsVo userDetailsVo = null;
        UsersVo usersVo = null;
        try {
            con = getConnetion();

            String userSql = "SELECT USERS.ID,users.USER_NAME,users.PASSWORD,users.USER_TYPE , users_details.FIRST_NAME,users_details.FATHER_NAME,users_details.MOBILE,users_details.image FROM users INNER JOIN users_details ON users.ID = users_details.USER_ID WHERE users.ID = ?";
            ps = con.prepareStatement(userSql);
            ps.setInt(1, id);
             rs = ps.executeQuery();
             while (rs.next()) {
                 usersVo = new UsersVo();
                 usersVo.setId(rs.getInt("ID"));
                 usersVo.setUsername(rs.getString("USER_NAME"));
                 usersVo.setPassword(rs.getString("PASSWORD"));
                 UsersType usersType = UsersType.getUsersTypeById(rs.getInt("USER_TYPE"));
                 usersVo.setUsersType(usersType);
              
                 userDetailsVo = new UserDetailsVo();
                 userDetailsVo.setFirstName(rs.getString("FIRST_NAME"));
                 userDetailsVo.setFatherName(rs.getString("FATHER_NAME"));
                 userDetailsVo.setMobile(rs.getString("MOBILE"));
                 userDetailsVo.setImage(rs.getBytes("image"));
                 userDetailsVo.setUsersVo(usersVo);
             }
        } catch (Exception ex) {
          
        } finally {
            rs.close();
            ps.close();
            closeConnection(con);
        }
        return userDetailsVo;
    }

}
