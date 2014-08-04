package com.software.naming.problem;

public class WrongConstantExample {
    private static final String name		= "name"; //상수명에 소문자 사용 (X)
    private static final String USERnAME	= "name"; //잘못된 단어간 구분 (X)
    private static final String U$ER_NAME	= "name"; //달러 기호’$’ 사용 (X)
    private String USER_NAME = "name"; //클래스 맴버 변수를 상수명으로 생성 (X)
}