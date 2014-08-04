package com.software.basic.problem;

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
        is.skip(1024);
        
        int i;
        StringBuilder sb = new StringBuilder();
        while((i = is.read()) != -1 ) {
            sb.append((char)i);
            
        }
        is.close();
        
        System.out.println(sb.length());
    }
}