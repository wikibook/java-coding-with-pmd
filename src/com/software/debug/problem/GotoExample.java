package com.software.debug.problem;

import java.io.IOException;
import java.net.MalformedURLException;

public class GotoExample {

    public static void main(String[] args) {
        try {
              try {
                /*
                 * 무언 가를 수행
                 */
                  System.out.println("원래 오류 발생");
                  throw new IOException();
              } catch (IOException e) {
                  System.out.println("IOException에서 MalformedURLException을 전달해서 다시 오류 처리");
                throw new MalformedURLException();
                // 위와 같은 처리는 GOTO를 사용해서 처리하면 오류 처리시 매우 혼란스럽다.
              }
            } catch (MalformedURLException e) {
                System.out.println("MalformedURLException 을 전달받아서 오류 처리");
              // 뭔가 오류 처리
            }
    }    
}