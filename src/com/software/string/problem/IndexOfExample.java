package com.software.string.problem;

public class IndexOfExample {

    public static void main(String[] args) {
        String str = "0123456789abcdef0123456789abcdef";

        //�پ��� indexOf �޼ҵ� ������ ��
        System.out.println("���� a�� " + str.indexOf("a") + "��°�� ��ġ�Ѵ�.");
        System.out.println("���ڿ� abc�� " + str.indexOf("abc") + "��°�� ��ġ�Ѵ�.");
        System.out.println("15��° ���� ���ĺ��� ã�� ���� a�� " + str.indexOf("a", 15) + "��°�� ��ġ�Ѵ�.");
        System.out.println("15��° ���� ���ĺ��� ã�� ���ڿ� abc�� " + str.indexOf("abc", 15) + "��°�� ��ġ�Ѵ�.");
    }
}