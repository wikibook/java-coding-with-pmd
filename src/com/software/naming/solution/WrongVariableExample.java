package com.software.naming.solution;
//�ǹ� �ľ��� �Һи��� �������� ��
public class WrongVariableExample {

    //private String wrongVariableExample; //Ŭ������� ���� �������� ������� �ʴ´�
    //private String doWhatever;    //�޼ҵ�� ���� �������� ������� �ʴ´�.
    //private String string;            //
    private String name;             //�ڷ����� ���� �������� ������� �ʴ´�.
    public void doWhatever() {
        this.name = "test";
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        WrongVariableExample wvExample = new WrongVariableExample();
        wvExample.doWhatever();
    }
}