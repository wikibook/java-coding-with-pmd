package com.software.string.solution;

public class WrongStringBuilderExample {

    public static void main(String[] args) {

        //StringBuffer/StringBuilder�� ���̴� �ʿ��� ��ŭ ����� �����ϴ� ���� ����.
        StringBuilder builderWithSize = new StringBuilder(100);
        StringBuffer bufferWithSize = new StringBuffer(100);
        
        String tempStr = "0123456789";
        
        for(int i=0; i < 10; i++) {
            builderWithSize.append(tempStr);
            bufferWithSize.append(tempStr);
        }
        
        //StringBuffer/StringBuilder�� ���ڰ� �ƴ� ���ڿ��� �ʱ�ȭ�ؾ� �Ѵ�.
        StringBuilder builderWithChar = new StringBuilder("a");
        StringBuffer bufferWithChar = new StringBuffer("a");
    }
}