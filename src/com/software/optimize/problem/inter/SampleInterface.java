package com.software.optimize.problem.inter;

public interface SampleInterface {
    /**
     * �������̽��� ��ü�� ������ ���� �Ծ��̱� ������
     * �⺻������ �������̽� ������ ��� ��Ҵ� public���� �����Ǿ� �ִ�.
     * ���� public Ű���带 ���� ���� �ʿ䰡 ������, 
     * private�� protected�� ����� �� ����,
     */
    int value = 0;
    String str = "test";
    
    void printValue();
    void printStr();
}
