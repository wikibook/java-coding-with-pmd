package com.software.design.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvoidSynchronizedExample {

    private List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
    
    /**
     * �޼ҵ� ��ü�� ������ ����ȭ �������� �����Ǿ�,
     * �޼ҵ��� ��� ����� ����Ǿ�� ����ȭ �������� ��� �� �ִ�.
     * @param user
     * @throws InterruptedException
     */
    public synchronized void addUser(Map<String, Object> user) throws InterruptedException {
        /*
         * ...
         * ...
         * ...
         */
        //��Ÿ ���μ����� ����Ǵ� �ð��� �����ؼ� 1�ʸ� ����
        Thread.sleep(1000);
    
        //���� �����ڿ��� �����ϴ� �κ�
        userList.add(user);
    }
    
}