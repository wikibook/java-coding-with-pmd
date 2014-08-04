package com.software.design.solution;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public class FileErrorExample {

    //public static Logger log = Logger.getLogger(FileErrorExample.class);
    public static void main(String[] args) {
        FileErrorExample example = new FileErrorExample();
        try {
        example.errorMethod2("test.txt", "ttt");
        } catch (FileAlreadyExistsException e) {
            //e.printStackTrace();
            //logger.error("[FILE002] ���� ���� ����");
           // logger.error(e.getMessage());
        }
    }
    
    /*
     * FileAlreadyExistsException
     * ������ �̹� �����Ѵٴ� ���� ������ �ܺο��� ȣ���� �� �ߺ��� ��θ� �����Ͽ� �߻��� ������
     * �޼ҵ� ���� ������ �ƴ�, �ܺ� ȣ�� ������ ���� �Ѵ�.
     */
    public void errorMethod2(String path, String str) throws FileAlreadyExistsException{
        try {
            File file = new File(path);
            Files.createFile(file.toPath());
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(str);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            //logger.error("[FILE001] ���� ���� ����");
           // logger.error(e.getMessage());
        }
    }
}