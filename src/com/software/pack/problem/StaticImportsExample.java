package com.software.pack.problem;

// Math ��ü�� PI�� ���� ����ϱ� ���ؼ� ���� ������ ���
import static java.lang.Math.PI;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static com.software.optimize.problem.AutoBoxingExample.main;
//�޷� ��ü�� ��� ���� ����� ���� ����ϱ� ���ؼ� ���� ������ ����Ѵ�.
import static java.util.Calendar.*;

public class StaticImportsExample {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(YEAR + "-" + (MONTH +1)  + "-" + DATE);
    }
}