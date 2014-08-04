package com.software.basic.solution.fin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public String getFileAsList(String path) {
        StringBuilder result = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line = null;
            while((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException e) {
            //catch���� ���� ������ ���� ó���� �ʿ��ϴ�.
            System.out.println(e);
        }
         
        return result.toString();
    }
}