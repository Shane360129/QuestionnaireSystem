package com.example.quest0618.vo;

public class UserDataResponse {

    private int userId;
    private String messsage;


    public UserDataResponse(String messsage) {
        this.messsage = messsage;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
