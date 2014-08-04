package com.software.coupling.solution.list;

import java.util.List;

public class ListMaker {

    /**
     * 메소드의 전달 인자와 반환 값의 자료형을 List 인터페이스로 선언하여
     * List 인터페이스를 바탕으로 구현한 모든 구현 객체는
     * 이 메소드를 활용할 수 있다.
     * @param list
     * @return
     */
    public List<String> make(List<String> list) {
        list.add("t");
        list.add("e");
        list.add("s");
        list.add("t");
        return list;
    }
}