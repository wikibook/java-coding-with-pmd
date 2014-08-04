package com.software.design.problem.call;
public class ChildrenClass extends ParentClass {
    private String name;
    public ChildrenClass(){
        //부모 클래스의 생성자을 호출할 때 
        //toString은 이미 자식 클래스의 toString으로 재정의된 상태이다.
        //그러므로 name은 아직 null인 상태이고
        //.toUpperCase() 실행 시 NullPointerException를 발생시킨다.
        super(); 
        name = "나는 자식이다";
    }
    @Override
    public String toString(){
        return name.toUpperCase();
    }
}