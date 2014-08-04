package com.software.string.problem;

public class StartWithExample {
    public static void main(String[] args) {
        StartWithExample example = new StartWithExample();
        
        example.doStartsWith();
        example.doIndexOf();
        
    }
    
    public void doStartsWith() {
        String str = "UPD00001";
        
        // 시작 시간
           long startTime = System.currentTimeMillis();
           //startsWith로 접두사를 100만 회 비교  
           for(int i=0; i < 1000000; i++) {
               if(str.startsWith("UPD")) {
                   //System.out.println("상품 정보를 수정합니다.");
               }
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##startWith  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
    
    public void doIndexOf() {
        String str = "UPD00001";
        
        // 시작 시간
           long startTime = System.currentTimeMillis();
           //indexOf로 접두사를 100만 회 비교  
           for(int i=0; i < 1000000; i++) {
               if(str.indexOf("UPD") == 0) {
                   //System.out.println("상품 정보를 수정합니다.");
               }
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##indexOf  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}