package com.software.coupling.solution.list;

import java.util.List;

public class ListMaker {

    /**
     * �޼ҵ��� ���� ���ڿ� ��ȯ ���� �ڷ����� List �������̽��� �����Ͽ�
     * List �������̽��� �������� ������ ��� ���� ��ü��
     * �� �޼ҵ带 Ȱ���� �� �ִ�.
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