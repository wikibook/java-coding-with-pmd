package com.software.design.problem;

public class SingletonClassTest1 {
    public static void main(String[] args) {
        /**
         *�̱��� Ŭ������ ���� getInstance()�� �̿��Ͽ� ���� ��ü�� ȣ���Ѵ�.
         *�̱��� Ŭ������ �����ڰ� private���� ���ѵǾ� �־ �ܺο���
         *���ο� ��ü�� ������ �� ����. 
         */
        System.out.println(SingletonClassExample1.getInstance().isEmpty(""));
        System.out.println(SingletonClassExample1.getInstance().changeMoney("1234"));
    }
}