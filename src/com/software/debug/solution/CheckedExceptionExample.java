package com.software.debug.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        CheckedExceptionExample example = new CheckedExceptionExample();
        String result;
        
        result = example.loadWebPage("ht://www.google.com", "d:\\web1.txt");
        System.out.println("���� ����: " + result);
        
        result = example.loadWebPage("http://www.google.com", "d:\\web2.txt");
        System.out.println("���� ����: " + result);
        
        result = example.loadWebPage("http://www.google.com", "z:\\web2.txt");
        System.out.println("���� ����: " + result);
        
        //�������ڸ� null�� �߸� ��������, loadWebPage �޼ҵ尡 �ڽ��� ���������� �ν��ϰ� ó���ϱ� ������
        //������ ��Ȯ�� ������ �ľ��ϱ� ��ƴ�.
        result = example.loadWebPage("http://www.google.com", null);
        System.out.println("���� ����: " + result);
 
    }
    
    /**
     * �� ������ ������ ���Ϸ� ����
     * @param url: �� ������ �ּ�
     * @param fileName: ���� ���ϸ�
     * @return ���� ���
     */
    public String loadWebPage(String urlStr, String fileName) {
        String result = "OK";
        URL url;
        try {
            url = new URL(urlStr);
            URLConnection con = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream() ));
            String line;
            File file =new File(fileName);
            
            // ������ �������� ������ ������ ����
            if(!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fileWriter = new FileWriter(file); //append file = (file, true)t
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while( ( line = bufferedReader.readLine() ) != null ) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
//                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        // URL ������ �ùٸ��� �ʾƼ� ������ �߻����� ��
        } catch (MalformedURLException e) {
            result = "ERR_URL";
            //���� Ŭ������ printStackTrace�� ����Ͽ�����
            //���������� �ùٸ� �α׸� �������
            e.printStackTrace();
        //������ ���� ������ �߻����� ��
        } catch (IOException e) {
            result = "ERR_FILE";
            //���� Ŭ������ printStackTrace�� ����Ͽ�����
            //���������� �ùٸ� �α׸� �������
            e.printStackTrace();
        }
        return result;
    }
    
}