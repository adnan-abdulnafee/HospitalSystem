package com.coders.hospital.db.type;

/**
 * @author Codersbay
 */
public enum UsersType {

    ADMIN(1, "admin"), DOCTOR(2, "doctor"), NURSE(3, "nurse");
//ممكن كمل بقية الثوابت عندي ك المريض و النرس و الخ

    private int id;
    private String type;

    UsersType(int id, String type) {
        this.id = id;
        this.type = type;
    }


    public static UsersType getUsersTypeById(int id) {
        for ( UsersType usersType : UsersType.values() ) {
            if (usersType.getId() == id) {
                return usersType;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}