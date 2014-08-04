package com.software.string.solution;

public class DuplicatedLiteralsExample {
    
    private String userId; 
    private String password;
    private String role;
    
    private static final String ROLE_ADMIN = "R01";
    private static final String ROLE_USER = "R02";
    
    public String getRoleName(String role) {
        if(ROLE_ADMIN.equals(role)) {
            return "관리자";
        } else if(ROLE_USER.equals(role)) {
            return "사용자";
        } else {
            return "미등록";
        }
    }
    
    public boolean changeRole(String role) {
        boolean result;
        if(ROLE_ADMIN.equals(role) && ROLE_USER.equals(role)) {
            result = false;
        } else {
            this.role = role;
            result = true;
        }
        return result;
    }
    
    public void createUser(String userId, String password) {
        if("admin".equals(userId)) {
            this.role = ROLE_ADMIN;
        } else {
            this.role = ROLE_USER;
        }
        this.userId = userId;
        this.password = password;
    }
    
    public boolean updateUser(String userId, String password, String role) {
        boolean result;
        if(ROLE_ADMIN.equals(role) && ROLE_USER.equals(role)) {
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
