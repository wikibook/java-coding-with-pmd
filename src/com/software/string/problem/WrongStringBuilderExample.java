package com.software.string.problem;

public class WrongStringBuilderExample {

    public static void main(String[] args) {
        //StringBuilder의 최적화를 위하여 StringBuilder의 길이를 설정할 수 있지만
        //잘못된 길이 즉 문자열의 길이보다 짧은 길이는 
        //오히려 StringBuilder의 성능을 저하한다.
        StringBuilder builderWithWrongSize = new StringBuilder(10);
        StringBuffer bufferWithWrongSize = new StringBuffer(10);
        
        //이렇게 원래 예상한 Builder/Buffer의 길이보다 더 긴 문자열이 입력되면
        //불필요한 인스턴스 길이 변경 작업이 빈번하게 발생한다.
        String tempStr = "0123456789";
        for(int i=0; i < 10; i++) {
            builderWithWrongSize.append(tempStr);
            bufferWithWrongSize.append(tempStr);
        }
        
        //StringBuilder의 값을 문자 a로 설정하여 등록하려는 목적으로 
        //char형의 a를 입력하면 StringBuilder는 이 문자를 ASCII코드 값으로 
        //변경하여 StringBuilder의 길이로 설정한다.
        //즉 a는 ASCII코드 값으로 97이므로
        //StringBuilder builder = new StringBuilder(97);과 동일하다.
        StringBuilder builderWithCase = new StringBuilder('a');
        StringBuffer bufferWithCase = new StringBuffer('a');
        
        System.out.println(builderWithCase.toString());
        System.out.println(builderWithCase.toString());
        
    }
}