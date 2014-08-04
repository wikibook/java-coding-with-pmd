package com.software.naming.problem;

public class VariableExample {

	public static void main(String[] args) {
		String Value; //대문자로 시작하는 변수명(X)
		String VALUE; //대문자의 변수명(X)
		String groupname; //단어의 구분이 부정확한 변수명(X)
		String Pneumonoultramicroscopicsilicovolcanoconiosis; // 너무 긴 변수명(X)
		String a123456789012345678;
		int a; //무의미한 한 글자의 너무 짧은 변수명(X)
		int temp; //무의미한 임시 변수명(X)
		String numValue; //의미가 부정확한 변수명(X)
		boolean statu$; //달러 기호’$’를 사용한 변수명(X)
		boolean group_name; //밑줄’_’을 사용한 변수명(X)
	}
}
