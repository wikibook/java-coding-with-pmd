package com.software.coupling.solution.demeter;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    //���� �ݰ�� ���� ���������� ������ �� ����..
    private Map<String, Integer> safe;
    
    public Bank() {
        safe = new HashMap<String, Integer>();
    }
    
    private boolean isCustomer(String customerCode) {
        return safe.containsKey(customerCode);
    }
    
    private boolean isEnable(String customerCode, int value) {
        return safe.get(customerCode) >= value;
    }
    
    /**
     * ���
     * @param customerCode �� �ڵ�
     * @param value ��ݾ�
     * @return ��������
     */
    public boolean widtrawal(String customerCode, int value) {
        //��ϵ� ���� �ƴϸ� ����� �� ����.
        if(!isCustomer(customerCode)) {
            return false;
        }
        
        //�ܾ��� �����ϸ� ����� �� ����.
        if(!isEnable(customerCode, value)) {
            return false;
        }
        int balance = safe.get(customerCode) - value;
        safe.remove(customerCode);
        safe.put(customerCode, balance);
        
        return true;
    }
    
    /**
     * �Ա�
     * @param customerCode ���ڵ�
     * @param value �Աݾ�
     * @return ��������
     */
    public boolean deposit(String customerCode, int value) {
        //��ϵ� ���� �ƴϸ� �Ա��� �� ����.
        if(!isCustomer(customerCode)) {
            return false;
        }
        
        int balance = safe.get(customerCode) + value;
        safe.remove(customerCode);
        safe.put(customerCode, balance);
        
        return true;
    }
    
    public boolean createCustomer(String customerCode, int value) {
        //���� ���̸� ��� �Ұ�
        if(isCustomer(customerCode)) {
            return false;
        }
        safe.put(customerCode, value);
        return true;
    }
}