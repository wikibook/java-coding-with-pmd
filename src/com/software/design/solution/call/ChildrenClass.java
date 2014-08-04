package com.software.design.solution.call;
public class ChildrenClass extends ParentClass {
    private String name;
    public ChildrenClass(){
        super(); 
        name = "나는 자식이다";
    }
    
    /**
     * 부모 클래스에서 toString 메소드를 상수 메소드로 설정하여
     * 자식 클래스는 더 이상 toString 메소드를 오버라이드 할 수 없다.
    @Override
    public String toString(){
        return name.toUpperCase();
    }
    */
    
    /**
     * 부모 클래스에서 print 메소드에 대한 구현을
     * 자식 클래스로 위임하였기 때문에
     * 자식 클래스는 print 메소드를 실행을 위해서 반드시 구현해야 한다. 
     */
    @Override
    public void print(){
        System.out.println(toString());
    }
}