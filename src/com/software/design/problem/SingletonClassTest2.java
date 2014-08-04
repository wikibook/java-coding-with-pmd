package com.software.design.problem;


public class SingletonClassTest2 {
    public static void main(String[] args) {
        /**
         *싱글톤 클래스의 사용시 getInstance()를 이용하여 유일 객체를 호출한다.
         *싱글톤 클래스는 생성자가 private으로 제한되어 있어서 외부에서
         *새로운 객체를 생성할 수 없다. 
         */
        System.out.println(SingletonClassExample2.getInstance().isEmpty(""));
        System.out.println(SingletonClassExample2.getInstance().changeMoney("1234"));
    }
}