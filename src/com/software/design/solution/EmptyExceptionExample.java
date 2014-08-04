package com.software.design.solution;

public class EmptyExceptionExample {

    public static Logger log = Logger.getLogger(EmptyExceptionExample.class);
    
    public static void main(String[] args) {
        
        String str = null;

        try {
            System.out.println(str.substring(0,2));
        //비어있는 catch 절로 인하여 NullPointerException이 무시된다.
        } catch(Exception e) {
            //최소한 오류가 발생했음을 알릴 수 있는 로그를 출력해야 한다.
            logger.error(e);
        } 
        

        //정상적으로 오류가 발생한다.
        System.out.println(str.substring(0,2));
    }

}
