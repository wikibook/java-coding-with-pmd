package com.software.debug.junit3;

public class IDGenerator {
    private int currentId;
    
    public IDGenerator(int currentId) {
        this.currentId = currentId;
    }
    
    public int getNewId() {
        return this.currentId++; 
    }
}