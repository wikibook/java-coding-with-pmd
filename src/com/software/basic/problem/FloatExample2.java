package com.software.basic.problem;
/**
 * float �ε��Ҽ����� ������
 * @author Byeongseon
 * 2013. 9. 13.
 */
public class FloatExample2 {
    public static void main(String[] args) {
        //java 7������ �Ʒ��� ���� ���� ���̿� _�ٷ� �ڸ����� ������ �� �ִ�.
        //������ java 7 �̸��� ���������� ������� �ʴ´�.
        int value1 = 2_000_000_000;
        int value2 = 2_000_000_050;
        
        float fValue1 = 2_000_000_000;
        float fValue2 = 2_000_000_000;
        //int���� value1�� value2�� �ٸ� ���̴�.
        System.out.println("int �� " + value1 + "�� "+ value2 +"�� " + (value1 == value2 ? "����" : "�ٸ���"));
        
        System.out.println("float �� " + fValue1 + "�� "+ fValue2 +"�� " + (fValue1 == fValue2 ? "����" : "�ٸ���"));
        
    }
}
