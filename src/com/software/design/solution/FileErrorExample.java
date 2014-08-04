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
            //logger.error("[FILE002] 파일 생성 오류");
           // logger.error(e.getMessage());
        }
    }
    
    /*
     * FileAlreadyExistsException
     * 파일이 이미 존재한다는 예외 사항은 외부에서 호출할 때 중복된 경로를 지정하여 발생한 오류로
     * 메소드 내부 오류가 아닌, 외부 호출 오류로 봐아 한다.
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
            //logger.error("[FILE001] 파일 쓰기 오류");
           // logger.error(e.getMessage());
        }
    }
}