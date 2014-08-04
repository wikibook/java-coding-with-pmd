package com.software.basic.solution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {
    
    //������Ƽ ������ ���
    private static final String DEFAULT_PROPERTIES_PATH = "d:\\test.properties";
    
    private static String serverIp;

    public static String getServerIp() {
        return serverIp;
    }
    public static void setServerIp(String serverIp) {
        PropertiesExample.serverIp = serverIp;
    }
    
    /**
     * ������Ƽ Ű�� ���� �ҷ��´�.
     * @param key: Ű
     * @return
     * @throws Exception
     */
    public static String getKey(String key) throws Exception {

        //������Ƽ�� ���� �Ʒ��� ���� Ŭ�����δ��� �̿��ؼ� ��� �ּҷ� �ҷ� �� �� �ִ�.
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