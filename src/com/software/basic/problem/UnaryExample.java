package com.software.basic.problem;

public class UnaryExample {
    public static void main(String[] args) {
        //오타 혹은 불필요하게 복잡하고 혼동되는 코드
        int i = - -1;
        int j = + - + 1;
        int z = ~~2;
        
        boolean b = !!true;
        boolean c = !!!true;
        
        //머리만 아프게 하는 코드
        int d = ~-2;
        int e = -~3;
        
    }
}