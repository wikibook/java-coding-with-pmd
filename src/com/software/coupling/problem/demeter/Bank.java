package com.software.coupling.problem.demeter;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    //은행 금고가 공개되어 있어 어디에서도 직접적인 접근이 가능하다.
    public Map<String, Integer> safe;
    
    public Bank() {
        safe = new HashMap<String, Integer>();
    }
}