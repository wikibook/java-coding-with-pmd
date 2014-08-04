package com.software.optimize.problem.inter;

public class SampleKlass implements SampleInterface{

    @Override
    public void printValue() {
        System.out.println(value);
        
    }

    @Override
    public void printStr() {
        System.out.println(str);
        
    }
    
    public static void main(String[] args) {
        SampleInterface sample = new SampleKlass();
        
        sample.printValue();
        sample.printStr();
        
        System.out.println(sample.value);
        System.out.println(sample.str);
    }

}