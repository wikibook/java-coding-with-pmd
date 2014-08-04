package com.software.basic.problem;
/**
 * for문에 float을 사용한 예
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
        //아래의 결과는 몇 일까? 50?
        System.out.println(count);
    }
}