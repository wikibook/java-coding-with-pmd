package com.software.string.solution;

public class IndexOfExample {

    public static void main(String[] args) {
        String str = "0123456789abcdef0123456789abcdef";

        //다양한 indexOf 메소드 사용법의 예
        //char형은 char형태의 작은 따옴표를 사용해야 한다.
        System.out.println("문자 a는 " + str.indexOf('a') + "번째에 위치한다.");
        System.out.println("문자열 abc는 " + str.indexOf("abc") + "번째에 위치한다.");
        
        //char형은 char형태의 작은 따옴표를 사용해야 한다.
        System.out.println("15번째 문자 이후부터 찾은 문자 a는 " + str.indexOf('a', 15) + "번째에 위치한다.");
        System.out.println("15번째 문자 이후부터 찾은 문자열 abc는 " + str.indexOf("abc", 15) + "번째에 위치한다.");
    }
}