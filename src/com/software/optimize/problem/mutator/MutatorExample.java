package com.software.optimize.problem.mutator;

import java.util.Date;

public class MutatorExample {

    public static void main(String[] args) {
    
        MutatorExample example = new MutatorExample();
        example.testConstructor();
        example.testAccessor();
    }
    
    public void testConstructor() {
        System.out.println("������ �׽�Ʈ");
        int[] lotto = new int[]{1,2,3,4,5,6};
        Date closingDate = new Date();
        LottoController controller = new LottoController(lotto, closingDate);
        System.out.println("������ �ζ� ����");
        System.out.println("������: " + controller.getClosingDate());
        System.out.print("�ζ� ��ȣ: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
        
        //�ζ� ���� �ð��� �ζ� ��ȣ�� ����
        closingDate.setDate(closingDate.getDate() + 1);
        lotto[0] = 10;
        lotto[1] = 11;
        lotto[2] = 12;
        
        System.out.println("\n\n�ζ� ������ ������ ������ ��");
        System.out.println("������: " + controller.getClosingDate());
        System.out.print("�ζ� ��ȣ: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
    }
    
    public void testAccessor() {
        System.out.println("\n\n������ �׽�Ʈ");
        
        LottoController controller = new LottoController(new int[]{1,2,3,4,5,6}, new Date());
        System.out.println("������ �ζ� ����");
        System.out.println("������: " + controller.getClosingDate());
        System.out.print("�ζ� ��ȣ: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
        
        //�ζ� ���� �ð��� �ζ� ��ȣ�� ����
        controller.getClosingDate().setDate(controller.getClosingDate().getDate() + 1);
        controller.getLotto()[0] = 10;
        controller.getLotto()[1] = 11;
        controller.getLotto()[2] = 12;
        
        System.out.println("\n\n�ζ� ������ ������ ������ ��");
        System.out.println("������: " + controller.getClosingDate());
        System.out.print("�ζ� ��ȣ: ");
        for(int value : controller.getLotto()) {
            System.out.print(value + " ");
        }
    }
    
}
