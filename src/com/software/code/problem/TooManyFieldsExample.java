package com.software.code.problem;

public class TooManyFieldsExample {
    
    //너무 많은 클래스 맴버 변수는 가독성을 저해하는 하나의 큰 요소다.
    private String userId;
    private String userPwd;
    private String userName;
    private String address;
    
    private String documentId;
    private String title;
    private String body;
    private String author;
    private String date;
    
    private String etc0;
    private String etc1;
    private String etc2;
    private String etc3;
    private String etc4;
    private String etc5;
    private String etc6;
    
    public static void main(String[] args) {
        
    }
    
    //3개 이상의 전달 인자는 메소드 사용시 혼란을 야기한다.
    public static void tooManyParameterList(String text0, String text1, String text2
                                                            ,String text3, String text4, String tex5
                                                            , String text6, String text7,String tex8
                                                            , String text9) {
        /*
         * 
         * 
         * 
         */
    }
}