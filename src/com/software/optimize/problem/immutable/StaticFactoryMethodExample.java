package com.software.optimize.problem.immutable;

import java.math.BigInteger;

public class StaticFactoryMethodExample {

    public static void main(String[] args) {
        /*
         * Boolean 객체의 상태는 true와 false만 존재하므로
         * 이 객체는 false와 ture 값을 갖는 신규 객체를 생성하지 않고 
         * 미리 등록되어 있는 객체를 제공한다.  
         */
        //Boolean bool1 = new Boolean(false); 새로운 객체를 생성할 필요가 없다.
        Boolean bool1 = Boolean.FALSE;
        //Boolean bool2 = new Boolean(true); 새로운 객체를 생성할 필요가 없다.
        Boolean bool2 = Boolean.TRUE;
        
        /*
         * BigInteger에서 자주 사용되는 0,1 그리고 10 또한 
         *  static factory method 패턴을 활용하여
         *  미리 등록되어 신규 객체를 생성할 필요가 없다.
         */
        BigInteger intZero = BigInteger.ZERO;
        BigInteger intOne = BigInteger.ONE;
    }
}