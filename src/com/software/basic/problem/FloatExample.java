package com.software.basic.problem;
/**
 * for���� float�� ����� ��
 * @author Byeongseon
 * 2013. 9. 12.
 */
public class FloatExample {
    public static void main(String[] args) {
        final int START = 2_000_000_000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
        }
        //�Ʒ��� ����� �� �ϱ�? 50?
        System.out.println(count);
    }
}