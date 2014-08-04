package com.software.code.problem;

public class UserVO {

    private String userId;
    private String userPwd;
    private String userName;
    private String address;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "UserVO [userId=" + userId + ", userPwd=" + userPwd
                + ", userName=" + userName + ", address=" + address + "]";
    }
    
}