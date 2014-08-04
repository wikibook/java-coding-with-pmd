package com.software.design.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvoidSynchronizedExample {

    private List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
    
    public void addUser(Map<String, Object> user) throws InterruptedException {

        // ��Ÿ ���μ����� ����Ǵ� �ð��� ������ 1�ʸ� ����
        Thread.sleep(1000);
    
        /**
         * ���� ���� �ڿ����� �����ϴ� ������ ������ ����ȭ �������� ������
         * ���� ������ �ּ������� ���� �� �ִ�.
         */
        synchronized (userList) {
            // ���� ���� �ڿ��� �����ϴ� �κ�
            userList.add(user);
        }
        
    }
    
}