package com.software.design.problem.call;
public class ChildrenClass extends ParentClass {
    private String name;
    public ChildrenClass(){
        //�θ� Ŭ������ �������� ȣ���� �� 
        //toString�� �̹� �ڽ� Ŭ������ toString���� �����ǵ� �����̴�.
        //�׷��Ƿ� name�� ���� null�� �����̰�
        //.toUpperCase() ���� �� NullPointerException�� �߻���Ų��.
        super(); 
        name = "���� �ڽ��̴�";
    }
    @Override
    public String toString(){
        return name.toUpperCase();
    }
}