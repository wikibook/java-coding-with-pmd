package com.software.empty.problem;

public class EmptyExceptionExample {

    public static void main(String[] args) {
        
        String str = null;

        try {
            System.out.println(str.substring(0,2));
        //����ִ� catch ���� ���Ͽ� NullPointerException�� ���õȴ�.
        } catch(Exception e) {
        } 
        

        //���������� ������ �߻��Ѵ�.
        System.out.println(str.substring(0,2));
    }

}
