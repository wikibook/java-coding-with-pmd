package com.software.basic.problem;

import java.util.Scanner;

public class ForNWhileExample {

    public static void main(String[] args) {
        forExample();
        whileExample();
    }
    
    /**
     * �Ϲ����� for���� ��
     */
    public static void forExample() {
        //������ ������ �ݺ����� for�� �������
        for (int i =1; i < 10; i++) {
            System.out.println("2 X " +i + " = " + 2 * i); 
        }
    }
    
    /**
     * �Ϲ����� while���� ��
     */
    public static void whileExample() {
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