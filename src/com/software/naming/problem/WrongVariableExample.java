package com.software.naming.problem;
//의미 파악이 불분명한 변수명의 예
public class WrongVariableExample {

    private String wrongVariableExample; //클래스명과 같은 변수명 (X)
    private String doWhatever;    //메소드와 같은 변수명 (X)
    private String string;            //자료형과 같은 변수명 (X)
    public void doWhatever() {
        this.string = "test";
        System.out.println(string);
    }
    
    public static void main(String[] args) {
        WrongVariableExample wvExample = new WrongVariableExample();
        wvExample.doWhatever();
    }
}