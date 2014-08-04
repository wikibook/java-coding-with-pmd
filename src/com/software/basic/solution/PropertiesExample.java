package com.software.basic.solution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {
    
    //프로퍼티 파일의 경로
    private static final String DEFAULT_PROPERTIES_PATH = "d:\\test.properties";
    
    private static String serverIp;

    public static String getServerIp() {
        return serverIp;
    }
    public static void setServerIp(String serverIp) {
        PropertiesExample.serverIp = serverIp;
    }
    
    /**
     * 프로퍼티 키로 값을 불러온다.
     * @param key: 키
     * @return
     * @throws Exception
     */
    public static String getKey(String key) throws Exception {

        //프로퍼티의 값은 아래와 같이 클래스로더를 이용해서 상대 주소로 불러 올 수 있다.
        // ClassLoader.getResourceAsStream("com.software.basic.problem.resource.test.properties");
        String value = null;
        InputStream is = new FileInputStream(DEFAULT_PROPERTIES_PATH);
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(is);
            value = properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {is.close();} catch (IOException e) {}
        }
        return value;
    }
    
    public static void main(String[] args) throws Exception {
        setServerIp(PropertiesExample.getKey("serverIp"));
        System.out.println("SERVER IP: " +getServerIp());
    }
}