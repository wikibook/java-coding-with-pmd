package com.software.naming.problem;
//�ǹ� �ľ��� �Һи��� �������� ��
public class WrongVariableExample {

    private String wrongVariableExample; //Ŭ������� ���� ������ (X)
    private String doWhatever;    //�޼ҵ�� ���� ������ (X)
    private String string;            //�ڷ����� ���� ������ (X)
    public void doWhatever() {
        this.string = "test";
        System.out.println(string);
    }
    
    public static void main(String[] args) {
        WrongVariableExample wvExample = new WrongVariableExample();
        wvExample.doWhatever();
    }
}