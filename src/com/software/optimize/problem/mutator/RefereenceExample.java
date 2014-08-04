package com.software.optimize.problem.mutator;

import java.util.Date;

public class RefereenceExample {

    public static void main(String[] args) {
    
    	int[] lotto = new int[]{1,2,3,4,5,6};
        Date closingDate = new Date();
        LottoController controller = new LottoController(lotto, closingDate);
        
        /**
         * 외부의 lotto의 고유 ID를 전달하여 LottoController의 클래스 맴버 변수를
         * 생성하였기 때문에 외부의 lotto와 클래스 맴버 변수인 lotto는 동일한 객체다. 
         */
        System.out.println("lotto 배열의 ObjectId: "  + lotto);
        System.out.println("controller.getLotto() 배열의 ObjectId: "  + controller.getLotto());
        
    }
    
}
