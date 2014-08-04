package com.software.design.problem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BadExceptionExample {

    /**
     * 발생된 모든 오류를 catch 절로 전달 받아 묵살하는 방식
     * 아무도 이 메소드에서  어떠한 오류가 발생했는지 알 수 없다. 
     * 
     */
    public void errorMethod1() {
        
        try {
            /*
             * 무언가 실행하는 코드
             */
        } catch (Exception e) {
            
        }
        
    }

    /**
     * 발생된 모든 오류를 호출한 메소드나 객체로 전달하고 무시함
     * 정확한 오류 발생 위치와 정보를 알 수 없다.
     * @throws Exception
     */
    public void errorMethod2() throws Exception{
        /*
         * 무언가 실행하는 코드
         */
    }
    
    /**
     * 개발자가 선택한 오류 헝태 이외의 모든 오류가 묵살된다.
     */
    public void errorMethod3() {
        try {
            /*
             * 무언가 실행하는 코드
             */
        } catch(Exception e) {
            if( e instanceof IOException) {
                //오류 처리
            } else if( e instanceof FileNotFoundException) {
                //오류 처리
            }
        }
    }
}