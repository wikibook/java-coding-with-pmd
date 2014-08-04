package com.software.naming.solution;
//의미 파악이 불분명한 변수명의 예
public class WrongVariableExample {

    //private String wrongVariableExample; //클래스명과 같은 변수명은 사용하지 않는다
    //private String doWhatever;    //메소드와 같은 변수명은 사용하지 않는다.
    //private String string;            //
    private String name;             //자료형과 같은 변수명은 사용하지 않는다.
    public void doWhatever() {
        this.name = "test";
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        WrongVariableExample wvExample = new WrongVariableExample();
        wvExample.doWhatever();
    }
}