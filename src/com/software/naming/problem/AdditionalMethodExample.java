package com.software.naming.problem;

public class AdditionalMethodExample {
	//생성자와 같은 메소드
	public int AdditionalMethodExample() {
		return 0;
	}
	//잘못된 equals 메소드 오버라이딩
	public int equals() {
		return 0;
	}
	//잘못된 hashCode 메소드 오버라이딩
	public int hashCode(int value) {
		return 0;
	}
}
