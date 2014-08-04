package com.software.design.problem.call;
public class ParentClass {
    public ParentClass(){
        //toString을 자식 클래스에서 오버라이딩 했을 경우 
        //NullPointerException이 발생할 가능성이 있다.
        toString();
    }
    public String toString(){
        return "나는 부모다";
    }
}