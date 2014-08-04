package com.software.string.solution;

public class WrongStringBuilderUseExample {

    //StringBuffer와 StringBuilder를 최대한 클래스 맴버 변수로 사용하지 않는다. 
    //private StringBuilder strBuilder = new StringBuilder();
    //private StringBuffer strBuffer = new StringBuffer();
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //StringBuilder 자체의 length 메소드를 사용한다.
        System.out.println("StringBuilder의 길이는 : " +builder.length());

        
        StringBuffer buffer = new StringBuffer();
      //연관된 문자열은 한번에 추가한다.
        buffer.append("Hello World");
        
        //append를 연결해서 사용하면 메소드 체인이 발생되지 않도록 
        //append를 연속해서 사용하지 않는다.
        buffer.append(httpRequest.getHeaderInfo());
        buffer.append("</head><data>");
        buffer.append(dataDao.getList());

        //StringBuilder 자체의 length 메소드를 사용한다.
        System.out.println("StringBuffer의 길이는 : " +buffer.length());
    }
}