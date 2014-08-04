package com.software.debug.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        CheckedExceptionExample example = new CheckedExceptionExample();
        String result;
        result = example.loadWebPage("ht://www.google.com", "d:\\web1.txt");
        System.out.println("저장 상태: " + result);
        
        result = example.loadWebPage("http://www.google.com", "d:\\web2.txt");
        System.out.println("저장 상태: " + result);
        
        result = example.loadWebPage("http://www.google.com", "z:\\web2.txt");
        System.out.println("저장 상태: " + result);
        
        result = example.loadWebPage("http://www.google.com", null);
        System.out.println("저장 상태: " + result);
 
    }
    
    /**
     * 웹 페이지 정보를 파일로 저장
     * @param url: 웹 페이지 주소
     * @param fileName: 저장 파일명
     * @return 저장 결과
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
            
            // 파일이 존재하지 않으면 파일을 생성
            if(!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fileWriter = new FileWriter(file); //append file = (file, true)
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while( ( line = bufferedReader.readLine() ) != null ) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Throwable e) {
            result = "ERR";
            //가장 잘못된 예외 처리 화면에만 문제점이 표출되고
            //어디에도 문제점이 기록되지 않아  
            //문제점이 정상적으로 노출되지 않고 숨겨진다. 
            e.printStackTrace();
        } 
        return result;
    }
    
}