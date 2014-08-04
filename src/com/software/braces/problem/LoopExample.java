package com.software.braces.problem;

public class LoopExample {

    public static void main(String[] args) {
        int size =0;
        //혼동될 수 있는 반복문 코드
        for(int i = 0; i < 10; i++) 
            size++;
        //...
        //혼동될 수 있는 반복문 코드
        while(size < 20) 
            size++;
        //...
    }
}