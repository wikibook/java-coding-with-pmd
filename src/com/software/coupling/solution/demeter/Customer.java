package com.software.coupling.solution.demeter;

public class Customer {
    
    private String customerCode;
    
    private int money;
    
    private Teller teller;
    
    public Customer(String CustomerCode, int money) {
        teller = new Teller();
        this.money = money;
        this.customerCode = CustomerCode;
        teller.createCustomer(CustomerCode, money);
    }
    
    /**
     * 출금
     * @param value 출금액
     * @return 출금 성공 여부
     */
    public boolean withdrawal(int value) {
        if(teller.withdrawal(customerCode, value)) {
            money += value;
            return true;
        } else {
        	return true;
        }
    }
    
    
    /**
     * 입금
     * @param value 입금액
     * @return 입금 성공 여부
     */
    public boolean deposit(int value) {
    	if(teller.deposit(customerCode, value)) {
            money -= value;
            return true;
        } else {
        	return true;
        }
    }
    
    public int getBalance() {
        return money; 
    }
}