package com.software.design.solution.call;
public abstract class ParentClass {
    public ParentClass(){
        //toString은 자식 클래스에 오버라이드 할 수 없으므로 
        //오버라이드 가능한 메소드를 호출하는 문제를
        //원천적으로 차단한다.
        toString();
        
        //print는 자식 클래스로 구현 권한을 온전히 위임하였으므로
        //부모 자식 클래스 간의 오버라이딩 충돌이 발생하지 않는다.
        print();
    }
    
    protected abstract void print();
    
    public final String toString(){
        return "나는 부모다";
    }
}