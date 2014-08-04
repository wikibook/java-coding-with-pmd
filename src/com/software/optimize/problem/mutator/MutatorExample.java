package com.software.optimize.problem.mutator;

import java.util.Date;

public class MutatorExample {

    public static void main(String[] args) {
    
        MutatorExample example = new MutatorExample();
        example.testConstructor();
        example.testAccessor();
    }
    
    public void testConstructor() {
        System.out.println("생성자 테스트");
        int[] lotto = new int[]{1,2,3,4,5,6};
        Date closingDate = new Date();
        LottoController controller = new LottoController(lotto, closingDate);
        System.out.println("생성된 로또 정보");
        System.out.println("마감일: " + controller.getClosingDate());
        System.out.print("로또 번호: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
        
        //로또 마감 시간과 로또 번호를 공격
        closingDate.setDate(closingDate.getDate() + 1);
        lotto[0] = 10;
        lotto[1] = 11;
        lotto[2] = 12;
        
        System.out.println("\n\n로또 정보를 공격한 이후의 값");
        System.out.println("마감일: " + controller.getClosingDate());
        System.out.print("로또 번호: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
    }
    
    public void testAccessor() {
        System.out.println("\n\n접근자 테스트");
        
        LottoController controller = new LottoController(new int[]{1,2,3,4,5,6}, new Date());
        System.out.println("생성된 로또 정보");
        System.out.println("마감일: " + controller.getClosingDate());
        System.out.print("로또 번호: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
        
        //로또 마감 시간과 로또 번호를 공격
        controller.getClosingDate().setDate(controller.getClosingDate().getDate() + 1);
        controller.getLotto()[0] = 10;
        controller.getLotto()[1] = 11;
        controller.getLotto()[2] = 12;
        
        System.out.println("\n\n로또 정보를 공격한 이후의 값");
        System.out.println("마감일: " + controller.getClosingDate());
        System.out.print("로또 번호: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
    }
    
}
