package com.software.basic.solution;
/**
 * for���� float�� ����� ��
 * @author Byeongseon
 * 2013. 9. 12.
 */
public class FloatExample {
    public static void main(String[] args) {
        final int START = 2_000_000_000;
        int count = 0;
        //int �Ǵ� long�� �̿�����.
        for (int f = START; f < START + 50; f++) {
            count++;
        }
        System.out.println(count);
    }
}