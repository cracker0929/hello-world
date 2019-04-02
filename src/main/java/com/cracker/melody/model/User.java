package com.cracker.melody.model;

public class User {
    private long userId;
    private String userName;
    private String userTruename;
    private Integer userAge;
    private String adderss;

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserTruename() {
        return userTruename;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public User(long userId, String userName, String userTruename, Integer userAge, String adderss) {
        this.userId = userId;
        this.userName = userName;
        this.userTruename = userTruename;
        this.userAge = userAge;
        this.adderss = adderss;
    }
}
