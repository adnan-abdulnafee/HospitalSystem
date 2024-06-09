package com.coders.hospital.db.vo;

/**
 * @author Codersbay
 */
public class UserDetailsVo {
    private int id;
    private UsersVo usersVo;
    private String FirstName;
    private String FatherName;
    private String Mobile;

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
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fathername) {
        FatherName = fathername;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        this.Mobile = mobile;
    }
}
