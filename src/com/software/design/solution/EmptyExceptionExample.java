package com.software.design.solution;

public class EmptyExceptionExample {

    public static Logger log = Logger.getLogger(EmptyExceptionExample.class);
    
    public static void main(String[] args) {
        
        String str = null;

        try {
            System.out.println(str.substring(0,2));
        //����ִ� catch ���� ���Ͽ� NullPointerException�� ���õȴ�.
        } catch(Exception e) {
            //�ּ��� ������ �߻������� �˸� �� �ִ� �α׸� ����ؾ� �Ѵ�.
            logger.error(e);
        } 
        

        //���������� ������ �߻��Ѵ�.
        System.out.println(str.substring(0,2));
    }

}
