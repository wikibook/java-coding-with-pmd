package com.software.braces.solution;

public class IfExample {

    public static void main(String[] args) {
        
        int size = 0;
        //�� �� ���� �ڵ�� ��ȣ�� ó���Ѵ�.
        if(size != 0) { 
            size++;
        }
        size++;
        
        if(size < 2) {
            size++;
        //�� �� ���� �ڵ�� ��ȣ�� ó���Ѵ�.
        } else {
            size++;
        }
        size++;
    }
}