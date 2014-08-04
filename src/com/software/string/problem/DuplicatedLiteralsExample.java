package com.software.string.problem;

public class DuplicatedLiteralsExample {
    
    private String userId; 
    private String password;
    private String role;
    
    public String getRoleName(String role) {
        if("R01".equals(role)) {
            return "관리자";
        } else if("R02".equals(role)) {
            return "사용자";
        } else {
            return "미등록";
        }
    }
    
    public boolean changeRole(String role) {
        boolean result;
        if("R01".equals(role) && "R02".equals(role)) {
            result = false;
        } else {
            this.role = role;
            result = true;
        }
        return result;
    }
    
    public void createUser(String userId, String password) {
        if("admin".equals(userId)) {
            this.role = "R01";
        } else {
            this.role = "R02";
        }
        this.userId = userId;
        this.password = password;
    }
    
    public boolean updateUser(String userId, String password, String role) {
        boolean result;
        if("R01".equals(role) && "R02".equals(role)) {
            result = false;
        } else {
            this.userId = userId;
            this.password = password;
            this.role = role;
            result = true;
        }
        return result;
    }
}
