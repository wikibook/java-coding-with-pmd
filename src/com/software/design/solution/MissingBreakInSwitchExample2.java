package com.software.design.solution;

public class MissingBreakInSwitchExample2 {

    public static void main(String[] args) {
        int key = args != null ? Integer.parseInt( args[0] ) : 0;
        /*
         * 이런 방식으로 if문을 사용하는 것이
         * 예제 3.1.11.2에서 case절을 중첩해서 사용하는 것 보다 정확하며 효율적이다.
         * 특히 switch문은 각각의 경우의 수를 case문으로 정의하여야 하지만,
         * if문은 조건식을 기준으로 경우의 수를 설정할 수 있다. 
         */
        
        //if(key == 2 || key == 4)
        if(key % 2 == 0) {
        	System.out.println(key +  "는 짝수다.");
        } else {
        	System.out.println(key +  "는 홀수다.");
        }
    }
}