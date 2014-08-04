package com.software.design.problem;

public class SwitchStmtsShouldHaveDefaultExample {

    private static final  int MSG01 = 1;
    private static final  int MSG02 = 2;
    private static final  int MSG03 = 3;
    
    public static void main(String[] args) {
        
        int msg = MSG01;
        
        //정해진 메시지만 처리할 수 있을 뿐 예외 적인 메시지는 처리할 수 없다.
        switch(msg) {
        case MSG01:
            showAdminContents();
            break;
        case MSG02:
            showUserContents();
            break;
        case MSG03:
            showGuestContents();
            break;
        }
    }
    
    public static void showGuestContents() {}
    public static void showUserContents() {}
    public static void showAdminContents() {}
}
