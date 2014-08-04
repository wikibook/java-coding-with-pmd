package com.software.optimize.problem.mutator;

import java.util.Date;

public class RefereenceExample {

    public static void main(String[] args) {
    
    	int[] lotto = new int[]{1,2,3,4,5,6};
        Date closingDate = new Date();
        LottoController controller = new LottoController(lotto, closingDate);
        
        /**
         * �ܺ��� lotto�� ���� ID�� �����Ͽ� LottoController�� Ŭ���� �ɹ� ������
         * �����Ͽ��� ������ �ܺ��� lotto�� Ŭ���� �ɹ� ������ lotto�� ������ ��ü��. 
         */
        System.out.println("lotto �迭�� ObjectId: "  + lotto);
        System.out.println("controller.getLotto() �迭�� ObjectId: "  + controller.getLotto());
        
    }
    
}
