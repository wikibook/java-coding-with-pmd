package com.software.basic.problem.fin;

public class FinallySample {

    public String test () {
        try {
            throw new Exception("���� �߻�!");
            
        } catch(Exception e) {
            throw e;
        } finally {
            return "OK";
        }
    }
}