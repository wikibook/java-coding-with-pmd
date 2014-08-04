package com.software.basic.solution;

public class ForeachExample {

    public static void main(String[] args) {
        int[] leftList = {2,3,4,5,6,7,8,9};
        int[] rightList = {1,2,3,4,5,6,7,8,9};

        //for���� �̿��� ��� �Ʒ��� ���� �ݺ������� ���ʿ��ϰ� i,j�� �����ؾ� ������
        //foreach������ ������ ��� ���ʿ��� ���������� �����Ƿ� 
        //�ڵ��� �������� ��������, �������� �Ǽ��� ���� �� �ִ�.
        for( int left : leftList ) {
            for(int right : rightList) {
                System.out.println(left + " X " + right + " = " + left * right);
            }
        }
    }
}