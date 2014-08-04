package com.software.coupling.problem.demeter;

public class Teller {

	//은행이 공개로 설정되어 있어 모든 객체가 접근할 수 있다.
	public Bank bank;
	
	public Teller() {
		bank = new Bank();
	}
	
}
