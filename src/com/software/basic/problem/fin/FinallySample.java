package com.software.basic.problem.fin;

public class FinallySample {

    public String test () {
        try {
            throw new Exception("예외 발생!");
            
        } catch(Exception e) {
            throw e;
        } finally {
            return "OK";
        }
    }
}