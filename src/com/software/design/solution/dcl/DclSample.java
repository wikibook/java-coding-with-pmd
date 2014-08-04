package com.software.design.solution.dcl;

public class DclSample {
    
    private static DclSample instance;
    
    private String msg = "초기화 이전";
    
    private DclSample() {}
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public static DclSample getInstance() {
        System.out.println("인스턴스 생성 시작");
        synchronized (DclSample.class) {
            if(instance == null) {                    //3,
                instance = new DclSample();      //4
                System.out.println("다음 아이디로 인스턴스가 생성됨:" + instance);    //9
                instance.setMsg( "초기화 완료" );    //10
            }
        }
        
        return instance;    //7,    11
    }
        
    public void printStatus() {
        System.out.println(msg);    //8,    12
    }
}