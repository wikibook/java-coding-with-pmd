package com.software.design.problem.coupling;

public class Teller {

	//������ ������ �����Ǿ� �־� ��� ��ü�� ������ �� �ִ�.
	public Bank bank;
	
	public Teller() {
		bank = new Bank();
	}
	
}
