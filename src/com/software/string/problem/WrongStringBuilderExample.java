package com.software.string.problem;

public class WrongStringBuilderExample {

    public static void main(String[] args) {
        //StringBuilder�� ����ȭ�� ���Ͽ� StringBuilder�� ���̸� ������ �� ������
        //�߸��� ���� �� ���ڿ��� ���̺��� ª�� ���̴� 
        //������ StringBuilder�� ������ �����Ѵ�.
        StringBuilder builderWithWrongSize = new StringBuilder(10);
        StringBuffer bufferWithWrongSize = new StringBuffer(10);
        
        //�̷��� ���� ������ Builder/Buffer�� ���̺��� �� �� ���ڿ��� �ԷµǸ�
        //���ʿ��� �ν��Ͻ� ���� ���� �۾��� ����ϰ� �߻��Ѵ�.
        String tempStr = "0123456789";
        for(int i=0; i < 10; i++) {
            builderWithWrongSize.append(tempStr);
            bufferWithWrongSize.append(tempStr);
        }
        
        //StringBuilder�� ���� ���� a�� �����Ͽ� ����Ϸ��� �������� 
        //char���� a�� �Է��ϸ� StringBuilder�� �� ���ڸ� ASCII�ڵ� ������ 
        //�����Ͽ� StringBuilder�� ���̷� �����Ѵ�.
        //�� a�� ASCII�ڵ� ������ 97�̹Ƿ�
        //StringBuilder builder = new StringBuilder(97);�� �����ϴ�.
        StringBuilder builderWithCase = new StringBuilder('a');
        StringBuffer bufferWithCase = new StringBuffer('a');
        
        System.out.println(builderWithCase.toString());
        System.out.println(builderWithCase.toString());
        
    }
}