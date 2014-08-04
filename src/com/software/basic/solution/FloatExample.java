package com.software.basic.solution;
/**
 * for문에 float을 사용한 예
 * @author Byeongseon
 * 2013. 9. 12.
 */
public class FloatExample {
    public static void main(String[] args) {
        final int START = 2_000_000_000;
        int count = 0;
        //int 또는 long을 이용하자.
        for (int f = START; f < START + 50; f++) {
            count++;
        }
        System.out.println(count);
    }
}