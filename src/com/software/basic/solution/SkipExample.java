package com.software.basic.solution;

import java.io.EOFException;
import java.io.FileInputStream;

public class SkipExample {
    /**
     * �Ϲ����� skip �޼ҵ� �����
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        FileInputStream is = new FileInputStream("d://text.txt");
        //1024 ����Ʈ ��ŭ �ǳʶٴ�.
        long skipSize = 1024;
        long skipped;
        //skipSize ��ŭ �ǳʶ� ������ �ݺ��Ѵ�.
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