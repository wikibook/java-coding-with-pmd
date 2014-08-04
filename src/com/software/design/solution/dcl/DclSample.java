package com.software.design.solution.dcl;

public class DclSample {
    
    private static DclSample instance;
    
    private String msg = "�ʱ�ȭ ����";
    
    private DclSample() {}
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public static DclSample getInstance() {
        System.out.println("�ν��Ͻ� ���� ����");
        synchronized (DclSample.class) {
            if(instance == null) {                    //3,
                instance = new DclSample();      //4
                System.out.println("���� ���̵�� �ν��Ͻ��� ������:" + instance);    //9
                instance.setMsg( "�ʱ�ȭ �Ϸ�" );    //10
            }
        }
        
        return instance;    //7,    11
    }
        
    public void printStatus() {
        System.out.println(msg);    //8,    12
    }
}