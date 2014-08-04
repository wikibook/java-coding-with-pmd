package com.software.optimize.problem;

public class UnnecessaryWrapperObjectCreationExample{
    public static void main(String[]args){
        int i;
        String s = "0";
        //String str = new String("");과 같이 불필요한 인스턴스 생성
        Integer i2 = new Integer(0);

        //valueOf(s)는 값을 반환할 때 새로운 인스턴스를 생성해서 반환하여 메모리를 낭비
        //Integer는 int로 자동 형변환되므로 intValue()는 불필요 
        i = Integer.valueOf(s).intValue();
        
        //Integer는 int로 자동 형변환되므로 이런 절차는 무의미함
        i2=Integer.valueOf(i).intValue();

        //valueOf(s)는 값을 반환할 때 새로운 인스턴스를 생성해서 반환하여 메모리를 낭비
        String s2=Integer.valueOf(i2).toString();
        
        
        //"" 공백 문자열을 추가해서 잘못된 방식의 자연수를 문자열로 변환하는 방식은
        //불필요한 문자열 인스턴스 생성으로 비효율적이다.
        String s3 = "" + 2;
        
        Integer i3 = 3;
        String s4 = "" + i3;
        
    }
}