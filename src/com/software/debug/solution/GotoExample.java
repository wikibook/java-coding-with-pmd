package com.software.debug.solution;

import java.io.IOException;
import java.net.MalformedURLException;

public class GotoExample {

    public static void main(String[] args) {
        try {
            /*
             * 무언 가를 수행
             */
            System.out.println("원래 오류 발생");
            throw new MalformedURLException();
        } catch (MalformedURLException e) {
        	System.out.println("MalformedURLException의 예외 처리만 수행");
        } catch (IOException e) {
            //Exception은 
            System.out.println("IOException의 예외 처리만 수행");
        }
    }
}