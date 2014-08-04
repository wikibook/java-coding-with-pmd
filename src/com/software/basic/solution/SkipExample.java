package com.software.basic.solution;

import java.io.EOFException;
import java.io.FileInputStream;

public class SkipExample {
    /**
     * 일반적인 skip 메소드 사용방법
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        FileInputStream is = new FileInputStream("d://text.txt");
        //1024 바이트 만큼 건너뛰다.
        long skipSize = 1024;
        long skipped;
        //skipSize 만큼 건너뛸 때까지 반복한다.
        while(skipSize != 0) {
        	skipped = is.skip(skipSize);
        	if(skipped == 0) {
        		throw new EOFException();
        	}
        	skipSize -= skipped;
        }
        
        int i;
        StringBuilder sb = new StringBuilder();
        while((i = is.read()) != -1 ) {
            sb.append((char)i);
            
        }
        is.close();
        
        System.out.println(sb.length());
    }
    
}