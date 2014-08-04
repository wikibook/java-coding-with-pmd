package com.software.basic.solution;

import java.util.Scanner;

public class ForNWhileExample2 {

    public static void main(String[] args) {
        unreadableForExample();
    }
    
    /**
     * 잘못된 for문의 예
     */
    public static void unreadableForExample() {
        String pwd = "password";
        Scanner scanner = new Scanner(System.in);

        //특정 조건에 따라 제어되어야 하는 반복문은 while을 사용하자
        while(true) {
            System.out.print("암호를 입력하세요: ");
            if(pwd.equals(scanner.next())) {
                System.out.println("암호 확인 ");
                break;
            }
        }
        scanner.close();
    }
    
}