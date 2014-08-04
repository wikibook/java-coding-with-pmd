package com.software.basic.tip;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * for�� foreach ���� ���ϴ� Ŭ���� 
 * @author Byeongseon
 * 2013. 9. 12.
 */
public class ForeachExample {

    public static void main(String[] args) {
        
        //������ �����ϱ� ���� ���� ��ü
        Random randomScore = new Random();
        
        //�پ��� �迭�� ����� �� ������ �����ֱ� ���Ͽ� �ٸ� ������ �迭�� ���
        List<String> studentList = new ArrayList<String>();
        studentList.add("��ö��");
        studentList.add("�迵��");
        studentList.add("ȫ�浿");
        

        String[] subjectList = {"����", "����", "����", "����"};
        
        /**
         * �Ʒ��� �ڵ�� �Ϲ����� for�� ����� ���� �ݺ����� ���ν�
         * �ݺ��� ���� i�� j�� �ΰ����� ������ �����ؾ� �Ѵ�. 
         * �׷� ���Ͽ�, �ڵ��� �������� �������� 
         * ������ ���װ� �߻��� ���ɼ��� �ִ�.
         */
        System.out.println("for�� �̿��� ���� ��� ���");
        System.out.println("========================");
        for(int i =0; i < studentList.size(); i++) {
            System.out.println("�л���: " + studentList.get(i) + "\n");
            
            for(int j =0; j < subjectList.length; j++) {
                System.out.println("\t����: " + subjectList[j] + "\t\t����: " + randomScore.nextInt(100));
            }
            System.out.println("========================");
        }
        
        /**
         * foreach�� ����� ��� ���ʿ��� ���������� �ʿ� ������ 
         * �ڵ��� �������� ��������� ��������.
         */
        System.out.println("\n\nforeach�� �̿��� ���� ��� ���");
        System.out.println("========================");
        for(String student : studentList) {
            System.out.println("�л���: " + student + "\n");
            for(String subject : subjectList) {
                System.out.println("\t����: " + subject + "\t\t����: " + randomScore.nextInt(100));
            }
            System.out.println("========================");
        }
        
    }
}
