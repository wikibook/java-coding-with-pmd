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
            System.out.println("·Î±×ÀÎ ÇÏ¼Ì½À´Ï´Ù.");
        case LOGOUT:
            System.out.println("·Î±×¾Æ¿ô ÇÏ¼Ì½À´Ï´Ù.");
            break;
        case SIGN_IN:
            System.out.println("°¡ÀÔÇÏ¼Ì½À´Ï´Ù.");
        case SIGN_OUT:
            System.out.println("Å»ÅðÇÏ¼Ì½À´Ï´Ù.");
            break;
        default:
            break;
        }	
    }
}