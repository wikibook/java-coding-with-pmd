package com.software.basic.solution;

import java.util.Scanner;

public class ForNWhileExample2 {

    public static void main(String[] args) {
        unreadableForExample();
    }
    
    /**
     * �߸��� for���� ��
     */
    public static void unreadableForExample() {
        String pwd = "password";
        Scanner scanner = new Scanner(System.in);

        //Ư�� ���ǿ� ���� ����Ǿ�� �ϴ� �ݺ����� while�� �������
        while(true) {
            System.out.print("��ȣ�� �Է��ϼ���: ");
            if(pwd.equals(scanner.next())) {
                System.out.println("��ȣ Ȯ�� ");
                break;
            }
        }
        scanner.close();
    }
    
}