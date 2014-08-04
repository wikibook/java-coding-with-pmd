package com.software.string.problem;

public class WrongStringBuilderUseExample {

    //StringBuffer와 StringBuilder를 클래스 맴버 변수로 사용하면
    //장시간 클래스 인스턴스가 생존할수록 메모리 누수이 가능성도 높아진다.
    private StringBuilder strBuilder = new StringBuilder();
    private StringBuffer strBuffer = new StringBuffer();
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
    
        //append를 연결해서 사용하면 메소드 체인이 발생되어 누수 가능성이 존재한다.
        builder.append("abc").append("def").append("123");

        //StringBuilder 자체의 length 메소드가 존재한다.
        //toString은 불필요한 인스턴스만 생성한다.
        System.out.println("StringBuilder의 길이는 : " +builder.toString().length());

        
        StringBuffer buffer = new StringBuffer();
        
        //연관된 문자열을 분리해서 입력하는 것은 비효율적이다.
        buffer.append("Hello").append(" ").append("World");
        
        buffer.append("<xml>").append("<head>").append(httpRequest.getHeaderInfo()).append("</head><data>").append(dataDao.getList());

        //StringBuilder 자체의 length 메소드가 존재한다.
        //toString은 불필요한 인스턴스만 생성한다.
        System.out.println("StringBuffer의 길이는 : " +buffer.toString().length());
    }
}