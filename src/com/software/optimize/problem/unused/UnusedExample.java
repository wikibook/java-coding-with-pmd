package com.software.optimize.problem.unused;

public class UnusedExample {
    //������ �ʴ� private Ŭ���� �ɹ� ����
    private String str = "test";
    
    //������ �ʴ� private �޼ҵ�
    private void unusedMethod() {
        /**
         * ... 
         */
    }
    
    public void sampleMethod() {
        //������ �ʴ� ���� ����
        String temp = "temp";
        System.out.println("temp�� ������ �ʾҴ�.");
    }
    
    /**
     * @param usedValue: ���� ���� ����
     * @param unusedValue: ������ ���� ���� ����
     */
    public void sampleMethod2(int usedValue, int unusedValue) {
        System.out.println("usedValue = " + usedValue);
    }
    
}
