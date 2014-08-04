package com.software.basic.problem;

public class IfExample2 {

    public static void main(String[] args) {
        String param = args.length == 0 ? "" : args[0];
        boolean isAdmin = "admin".equals(param);  
        
        //원래는 관리자임을 확인하고 진행해야 하는 코드이지만,
        //개발자가 임의로 프로세스 진행을 확인 하기 위하여 임의로 수정한 조건문
        //if(isAdmin) {
        if (true) {
            
            /**
             * 길고 긴 코드
             */
        }
    }
}