package com.software.design.problem;

import java.text.DecimalFormat;
/**
 * ���� Ŭ���� �׽�Ʈ�� ���� Ŭ����
 * ��� �޼ҵ�� public static���� ���ǵǾ� �ִ�.
 * @author Byeongseon
 *
 */
public class StaticClassExample {
    /**
     * ����ִ� ���ڿ������� Ȯ���ϴ� ���� �޼ҵ�
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty() ? true : false;
    }
    
    /**
     * ���ڿ��� �ڸ����� �ִ� ���ڷ� �����ϴ� �޼ҵ�
     * @param str
     * @return
     */
    public static String changeMoney(String str) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(Integer.valueOf(str));
    }
}