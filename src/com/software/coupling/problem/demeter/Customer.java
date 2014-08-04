package com.software.coupling.problem.demeter;

public class Customer {
    
    public String CustomerCode;
    
    public int money;
    
    public Teller teller;
    
    public Customer(String CustomerCode, int money) {
        teller = new Teller();
        this.money = money;
        this.CustomerCode = CustomerCode;
    }
    
    /**
     * 출금
     * @param value 출금액
     * @return 출금 성공 여부
     */
    public boolean withdrawal(int value) {
        int deposit = teller.bank.safe.get(CustomerCode);
        boolean result;
        if(deposit - value >= 0) {
            money += value;
            teller.bank.safe.remove(CustomerCode);
            teller.bank.safe.put(CustomerCode, deposit - value);
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    
    
    /**
     * 입금
     * @param value 입금액
     * @return 입금 성공 여부
     */
    public boolean deposit(int value) {
        boolean result;
        int deposit = teller.bank.safe.get(CustomerCode);
        if(money - value >= 0) {
            money -= value;
            teller.bank.safe.remove(CustomerCode);
            teller.bank.safe.put(CustomerCode, deposit + value);
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}