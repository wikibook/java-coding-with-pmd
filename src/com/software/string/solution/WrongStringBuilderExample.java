package com.software.string.solution;

public class WrongStringBuilderExample {

    public static void main(String[] args) {

        //StringBuffer/StringBuilder의 길이는 필요한 만큼 충분히 설정하는 것이 좋다.
        StringBuilder builderWithSize = new StringBuilder(100);
        StringBuffer bufferWithSize = new StringBuffer(100);
        
        String tempStr = "0123456789";
        
        for(int i=0; i < 10; i++) {
            builderWithSize.append(tempStr);
            bufferWithSize.append(tempStr);
        }
        
        //StringBuffer/StringBuilder를 문자가 아닌 문자열로 초기화해야 한다.
        StringBuilder builderWithChar = new StringBuilder("a");
        StringBuffer bufferWithChar = new StringBuffer("a");
    }
}