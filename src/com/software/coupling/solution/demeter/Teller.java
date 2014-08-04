package com.software.coupling.solution.demeter;

public class Teller {

    //창구직원만 직접 은행의 출금 절창 접근할 수 있다.
    private Bank bank;
    
    public Teller() {
        bank = new Bank();
    }
    
    public boolean withdrawal(String customerCode, int value) {
        /*
         * 고객을 인증하고 입력된 값을 확인하는 철차
         * ...
         */
        
        return bank.widtrawal(customerCode, value);
        
    }
    
    public boolean deposit(String customerCode, int value) {
        /*
         * 고객을 인증하고 입력된 값을 확인하는 철차
         * ...
         */
        
        return bank.deposit(customerCode, value);
        
    }
    
    public boolean createCustomer(String customerCode, int value) {
        /*
         * 고객을 인증하고 입력된 값을 확인하는 철차
         * ...
         */
        
        return bank.createCustomer(customerCode, value);
        
    }
    
}
