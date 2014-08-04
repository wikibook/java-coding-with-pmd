package com.software.coupling.solution.demeter;

public class Teller {

    //â�������� ���� ������ ��� ��â ������ �� �ִ�.
    private Bank bank;
    
    public Teller() {
        bank = new Bank();
    }
    
    public boolean withdrawal(String customerCode, int value) {
        /*
         * ���� �����ϰ� �Էµ� ���� Ȯ���ϴ� ö��
         * ...
         */
        
        return bank.widtrawal(customerCode, value);
        
    }
    
    public boolean deposit(String customerCode, int value) {
        /*
         * ���� �����ϰ� �Էµ� ���� Ȯ���ϴ� ö��
         * ...
         */
        
        return bank.deposit(customerCode, value);
        
    }
    
    public boolean createCustomer(String customerCode, int value) {
        /*
         * ���� �����ϰ� �Էµ� ���� Ȯ���ϴ� ö��
         * ...
         */
        
        return bank.createCustomer(customerCode, value);
        
    }
    
}
