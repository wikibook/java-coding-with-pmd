package com.software.basic.tip;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * for와 foreach 문을 비교하는 클래스 
 * @author Byeongseon
 * 2013. 9. 12.
 */
public class ForeachExample {

    public static void main(String[] args) {
        
        //점수를 생성하기 위한 난수 객체
        Random randomScore = new Random();
        
        //다양한 배열이 적용될 수 있음을 보여주기 위하여 다른 형태의 배열을 사용
        List<String> studentList = new ArrayList<String>();
        studentList.add("이철수");
        studentList.add("김영희");
        studentList.add("홍길동");
        

        String[] subjectList = {"국어", "수학", "영어", "국사"};
        
        /**
         * 아래의 코드는 일반적인 for를 사용한 이중 반복문의 예로써
         * 반복문 사용시 i와 j의 부가적인 변수를 생성해야 한다. 
         * 그로 인하여, 코드의 가독성이 떨어지고 
         * 논리적인 버그가 발생할 가능성이 있다.
         */
        System.out.println("for를 이용한 성적 목록 출력");
        System.out.println("========================");
        for(int i =0; i < studentList.size(); i++) {
            System.out.println("학생명: " + studentList.get(i) + "\n");
            
            for(int j =0; j < subjectList.length; j++) {
                System.out.println("\t과목: " + subjectList[j] + "\t\t점수: " + randomScore.nextInt(100));
            }
            System.out.println("========================");
        }
        
        /**
         * foreach를 사용한 경우 불필요한 증감변수가 필요 없으며 
         * 코드의 가독성이 상대적으로 높아진다.
         */
        System.out.println("\n\nforeach를 이용한 성적 목록 출력");
        System.out.println("========================");
        for(String student : studentList) {
            System.out.println("학생명: " + student + "\n");
            for(String subject : subjectList) {
                System.out.println("\t과목: " + subject + "\t\t점수: " + randomScore.nextInt(100));
            }
            System.out.println("========================");
        }
        
    }
}
