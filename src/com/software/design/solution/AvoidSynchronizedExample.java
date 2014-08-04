package com.software.design.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvoidSynchronizedExample {

    private List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
    
    public void addUser(Map<String, Object> user) throws InterruptedException {

        // 기타 프로세스가 진행되는 시간을 가정해 1초를 설정
        Thread.sleep(1000);
    
        /**
         * 실제 공유 자원에을 접근하는 영역만 스레드 동기화 영역으로 설정해
         * 병목 현상을 최소한으로 만들 수 있다.
         */
        synchronized (userList) {
            // 실제 공유 자원에 접근하는 부분
            userList.add(user);
        }
        
    }
    
}