package com.software.basic.solution;

public class ForeachExample {

    public static void main(String[] args) {
        int[] leftList = {2,3,4,5,6,7,8,9};
        int[] rightList = {1,2,3,4,5,6,7,8,9};

        //for문을 이용할 경우 아래의 이중 반복문에서 불필요하게 i,j를 생성해야 하지만
        //foreach문으로 구성할 경우 불필요한 증감변수가 없으므로 
        //코드의 가독성이 높아지며, 개발자의 실수를 줄일 수 있다.
        for( int left : leftList ) {
            for(int right : rightList) {
                System.out.println(left + " X " + right + " = " + left * right);
            }
        }
    }
}