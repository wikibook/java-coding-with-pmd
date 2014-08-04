package com.software.design.problem;

public class MissingBreakInSwitchExample1 {

    private static final int LOGIN = 0;
    private static final int LOGOUT = 1;
    private static final int SIGN_IN = 2;
    private static final int SIGN_OUT = 3;
    
    public static void main(String[] args) {
        int key = args != null ? Integer.parseInt( args[0] ) : 0;
        switch (key) {
        case LOGIN:
            System.out.println("�α��� �ϼ̽��ϴ�.");
        case LOGOUT:
            System.out.println("�α׾ƿ� �ϼ̽��ϴ�.");
            break;
        case SIGN_IN:
            System.out.println("�����ϼ̽��ϴ�.");
        case SIGN_OUT:
            System.out.println("Ż���ϼ̽��ϴ�.");
            break;
        default:
            break;
        }	
    }
}