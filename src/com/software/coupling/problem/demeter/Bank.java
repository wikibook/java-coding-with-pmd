package com.software.coupling.problem.demeter;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    //���� �ݰ� �����Ǿ� �־� ��𿡼��� �������� ������ �����ϴ�.
    public Map<String, Integer> safe;
    
    public Bank() {
        safe = new HashMap<String, Integer>();
    }
}