package com.software.basic.solution.fin;

public class FinallySample {

    public String test () throws Exception{
        try {
            throw new Exception("���� �߻�!");
            
        } catch(Exception e) {
            throw e;
        }
    }
}