package com.software.optimize.problem;

public class UnnecessaryWrapperObjectCreationExample{
    public static void main(String[]args){
        int i;
        String s = "0";
        //String str = new String("");�� ���� ���ʿ��� �ν��Ͻ� ����
        Integer i2 = new Integer(0);

        //valueOf(s)�� ���� ��ȯ�� �� ���ο� �ν��Ͻ��� �����ؼ� ��ȯ�Ͽ� �޸𸮸� ����
        //Integer�� int�� �ڵ� ����ȯ�ǹǷ� intValue()�� ���ʿ� 
        i = Integer.valueOf(s).intValue();
        
        //Integer�� int�� �ڵ� ����ȯ�ǹǷ� �̷� ������ ���ǹ���
        i2=Integer.valueOf(i).intValue();

        //valueOf(s)�� ���� ��ȯ�� �� ���ο� �ν��Ͻ��� �����ؼ� ��ȯ�Ͽ� �޸𸮸� ����
        String s2=Integer.valueOf(i2).toString();
        
        
        //"" ���� ���ڿ��� �߰��ؼ� �߸��� ����� �ڿ����� ���ڿ��� ��ȯ�ϴ� �����
        //���ʿ��� ���ڿ� �ν��Ͻ� �������� ��ȿ�����̴�.
        String s3 = "" + 2;
        
        Integer i3 = 3;
        String s4 = "" + i3;
        
    }
}