package com.software.debug.solution;

import java.io.IOException;
import java.net.MalformedURLException;

public class GotoExample {

    public static void main(String[] args) {
        try {
            /*
             * ���� ���� ����
             */
            System.out.println("���� ���� �߻�");
            throw new MalformedURLException();
        } catch (MalformedURLException e) {
        	System.out.println("MalformedURLException�� ���� ó���� ����");
        } catch (IOException e) {
            //Exception�� 
            System.out.println("IOException�� ���� ó���� ����");
        }
    }
}