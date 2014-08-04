package com.software.design.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvoidSynchronizedExample {

    private List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
    
    /**
     * 메소드 전체가 스레드 동기화 영역으로 설정되어,
     * 메소드의 모든 기능이 수행되어야 동기화 영역에서 벗어날 수 있다.
     * @param user
     * @throws InterruptedException
     */
    public synchronized void addUser(Map<String, Object> user) throws InterruptedException {
        /*
         * ...
         * ...
         * ...
         */
        //기타 프로세스가 진행되는 시간을 가정해서 1초를 설정
        Thread.sleep(1000);
    
        //실제 공유자원에 접근하는 부분
        userList.add(user);
    }
    
}