package com.coders.hospital.db.vo;

/**
 * @author Codersbay
 */
public class UsersDetailsVo {
    private int id;
    private UsersVo usersVo;
    private String firstName;
    private String Fathername;
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersVo getUsersVo() {
        return usersVo;
    }

    public void setUsersVo(UsersVo usersVo) {
        this.usersVo = usersVo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFathername() {
        return Fathername;
    }

    public void setFathername(String fathername) {
        Fathername = fathername;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
