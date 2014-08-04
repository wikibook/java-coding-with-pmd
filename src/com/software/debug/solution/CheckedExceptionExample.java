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
        System.out.println("저장 상태: " + result);
        
        result = example.loadWebPage("http://www.google.com", "d:\\web2.txt");
        System.out.println("저장 상태: " + result);
        
        result = example.loadWebPage("http://www.google.com", "z:\\web2.txt");
        System.out.println("저장 상태: " + result);
        
        //전달인자를 null로 잘못 보냈지만, loadWebPage 메소드가 자신의 문제점으로 인식하고 처리하기 때문에
        //문제의 정확한 원인을 파악하기 어렵다.
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
            
            FileWriter fileWriter = new FileWriter(file); //append file = (file, true)t
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while( ( line = bufferedReader.readLine() ) != null ) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
//                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        // URL 형식이 올바르지 않아서 문제가 발생했을 때
        } catch (MalformedURLException e) {
            result = "ERR_URL";
            //시험 클래스라 printStackTrace을 사용하였지만
            //실전에서는 올바른 로그를 사용하자
            e.printStackTrace();
        //파일을 저장 문제가 발생했을 때
        } catch (IOException e) {
            result = "ERR_FILE";
            //시험 클래스라 printStackTrace을 사용하였지만
            //실전에서는 올바른 로그를 사용하자
            e.printStackTrace();
        }
        return result;
    }
    
}