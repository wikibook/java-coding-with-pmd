package com.software.debug.problem;

import java.io.IOException;
import java.net.MalformedURLException;

public class GotoExample {

    public static void main(String[] args) {
        try {
              try {
                /*
                 * ���� ���� ����
                 */
                  System.out.println("���� ���� �߻�");
                  throw new IOException();
              } catch (IOException e) {
                  System.out.println("IOException���� MalformedURLException�� �����ؼ� �ٽ� ���� ó��");
                throw new MalformedURLException();
                // ���� ���� ó���� GOTO�� ����ؼ� ó���ϸ� ���� ó���� �ſ� ȥ��������.
              }
            } catch (MalformedURLException e) {
                System.out.println("MalformedURLException �� ���޹޾Ƽ� ���� ó��");
              // ���� ���� ó��
            }
    }    
}