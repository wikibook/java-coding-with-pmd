package com.software.coupling.problem.demeter;

public class Teller {

	//������ ������ �����Ǿ� �־� ��� ��ü�� ������ �� �ִ�.
	public Bank bank;
	
	public Teller() {
		bank = new Bank();
	}
	
}
