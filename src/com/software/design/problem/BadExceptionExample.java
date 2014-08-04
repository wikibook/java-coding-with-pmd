package com.software.design.problem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BadExceptionExample {

    /**
     * �߻��� ��� ������ catch ���� ���� �޾� �����ϴ� ���
     * �ƹ��� �� �޼ҵ忡��  ��� ������ �߻��ߴ��� �� �� ����. 
     * 
     */
    public void errorMethod1() {
        
        try {
            /*
             * ���� �����ϴ� �ڵ�
             */
        } catch (Exception e) {
            
        }
        
    }

    /**
     * �߻��� ��� ������ ȣ���� �޼ҵ峪 ��ü�� �����ϰ� ������
     * ��Ȯ�� ���� �߻� ��ġ�� ������ �� �� ����.
     * @throws Exception
     */
    public void errorMethod2() throws Exception{
        /*
         * ���� �����ϴ� �ڵ�
         */
    }
    
    /**
     * �����ڰ� ������ ���� ���� �̿��� ��� ������ ����ȴ�.
     */
    public void errorMethod3() {
        try {
            /*
             * ���� �����ϴ� �ڵ�
             */
        } catch(Exception e) {
            if( e instanceof IOException) {
                //���� ó��
            } else if( e instanceof FileNotFoundException) {
                //���� ó��
            }
        }
    }
}