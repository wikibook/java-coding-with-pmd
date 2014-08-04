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
     * ���
     * @param value ��ݾ�
     * @return ��� ���� ����
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
     * �Ա�
     * @param value �Աݾ�
     * @return �Ա� ���� ����
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