package com.software.pack.problem;

// Math 객체의 PI를 직접 사용하기 위해서 정적 참조를 사용
import static java.lang.Math.PI;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static com.software.optimize.problem.AutoBoxingExample.main;
//달력 객체의 모든 정적 기능을 직접 사용하기 위해서 정적 참조를 사용한다.
import static java.util.Calendar.*;

public class StaticImportsExample {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(YEAR + "-" + (MONTH +1)  + "-" + DATE);
    }
}