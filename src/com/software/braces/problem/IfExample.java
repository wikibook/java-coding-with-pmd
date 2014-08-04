package com.software.braces.problem;

public class IfExample {

    public static void main(String[] args) {
        
        int size = 0;
        
        if(size != 0) 
            size++;
        size++;
        
        if(size < 2) {
            size++;
        } else
            size++;
        size++;
    }
}