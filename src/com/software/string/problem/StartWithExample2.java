package com.software.string.problem;

public class StartWithExample2 {
    public static void main(String[] args) {
        StartWithExample2 example = new StartWithExample2();
        
        example.doStartsWith();
        example.doCharAt();
        
    }
    
    public void doStartsWith() {
        String str = "U00001";
        
        // 시작 시간
           long startTime = System.currentTimeMillis();
           //startsWith로 접두사를 100만 회 비교  
           for(int i=0; i < 1000000; i++) {
               if(str.startsWith("U")) {
                   //System.out.println("상품 정보를 수정합니다.");
               }
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##startWith  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
    
    public void doCharAt() {
        String str = "U00001";
        
        // 시작 시간
           long startTime = System.currentTimeMillis();
           //charAt으로 접두사를 100만 회 비교  
           for(int i=0; i < 1000000; i++) {
               if(str.charAt(0) == 'U') {
                   //System.out.println("상품 정보를 수정합니다.");
               }
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##charAt  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}