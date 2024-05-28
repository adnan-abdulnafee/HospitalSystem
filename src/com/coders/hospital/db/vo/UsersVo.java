package com.coders.hospital.db.vo;

import com.coders.hospital.db.type.UsersType;

/**
 *
 * @author Codersbay
 */
public class UsersVo {
    private int id ;
    private String username ;
    private String password ;
    private UsersType usersType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsersType getUsersType() {
        return usersType;
    }

    public void setUsersType(UsersType usersType) {
        this.usersType = usersType;
    }
    
   
    
}
