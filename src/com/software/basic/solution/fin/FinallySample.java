package com.software.basic.solution.fin;

public class FinallySample {

    public String test () throws Exception{
        try {
            throw new Exception("예외 발생!");
            
        } catch(Exception e) {
            throw e;
        }
    }
}