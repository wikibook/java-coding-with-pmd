package com.software.optimize.solution;

public class UnnecessaryWrapperObjectCreationExample{
    public static void main(String[]args){
        String s = "0";

        Integer i = 1;
        
        //valueOf(s)�� ���ο� Integer �ν��Ͻ��� ���������� parseInt�� ���ο� Integer �ν��Ͻ��� �������� �ʴ´�.
        int i2 = Integer.parseInt(s);
        double d= Double.parseDouble(s);
        float  f = Float.parseFloat(s);
        
        System.out.println(i2);
        System.out.println(d);
        System.out.println(f);
        
        //�ڽ�ȭ �⺻���� �⺻������ ���ڿ��� ��ȯ�ϱ� ���� toString�� �������̵��ϰ� �ִ�.
        //���� "" + intValue�� ���� ���� ���ڸ� �̿��� ����ȯ�� ���ʿ��ϴ�.
        String s1 = Integer.toString(i2);
        String s2 = Double.toString(1.1);
        
        Double d2 = 1.2;
        
        String s3 = d2.toString();
        
        System.out.println(d2 + " : "  + s3);
        
    }
}