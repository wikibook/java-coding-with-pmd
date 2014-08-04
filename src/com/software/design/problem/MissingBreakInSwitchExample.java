package com.software.design.problem;

public class MissingBreakInSwitchExample {

    public static void main(String[] args) {
        int key = args != null ? Integer.parseInt( args[0] ) : 0;
        switch (key) {
        case 2:
        case 4:
            System.out.println(key +  "´Â Â¦¼ö´Ù.");
            break;
        case 1:
        case 3:
            System.out.println(key +  "´Â È¦¼ö´Ù.");
            break;
        default:
            break;
        }
    }
}