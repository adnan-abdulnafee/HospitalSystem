package com.coders.hospital.db.type;

/**
 * @author Codersbay
 */
public enum UsersType {

    ADMIN(1, "admin"), DOCTOR(2, "doctor"), NURSE(3, "nurse"),RECEPTION(4,"reception"),PATIENT(5,"patient"),PHARMACIST(6,"pharmacist"),LABORATORIST(7,"laboratorist"),ACOUNTANT(8,"acountant");


    public static UsersType getUsersTypeById(int type) {
               for ( UsersType usersType : UsersType.values() ) {
            int t = usersType.getId();
            if (t == type ) {
                return usersType;
            }
        }
        return null;
    }


    private int id;
    private String type;

    UsersType(int id, String type) {
        this.id = id;
        this.type = type;
    }


    public static UsersType getUsersTypeByType(String type) {
        for ( UsersType usersType : UsersType.values() ) {
            if (usersType.getType()== type ) {
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