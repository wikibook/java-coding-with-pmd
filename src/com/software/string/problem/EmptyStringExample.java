package com.software.string.problem;

public class EmptyStringExample {

    public static void main(String[] args) {
        String emptyString = " ";
        //trim�� length�� �̿��� ����� ���ʿ��� �ν��Ͻ� ������
        //isWhiteSpace �޼ҵ庸�� ��Ȯ���� ��������.
        if(emptyString.trim().length() == 0) {
            System.out.println("emptyString�� ����ִ�.");
        } else {
            System.out.println("emptyString�� ������� �ʴ�.");
        }
    }
}