package com.software.design.solution.call;
public class ChildrenClass extends ParentClass {
    private String name;
    public ChildrenClass(){
        super(); 
        name = "���� �ڽ��̴�";
    }
    
    /**
     * �θ� Ŭ�������� toString �޼ҵ带 ��� �޼ҵ�� �����Ͽ�
     * �ڽ� Ŭ������ �� �̻� toString �޼ҵ带 �������̵� �� �� ����.
    @Override
    public String toString(){
        return name.toUpperCase();
    }
    */
    
    /**
     * �θ� Ŭ�������� print �޼ҵ忡 ���� ������
     * �ڽ� Ŭ������ �����Ͽ��� ������
     * �ڽ� Ŭ������ print �޼ҵ带 ������ ���ؼ� �ݵ�� �����ؾ� �Ѵ�. 
     */
    @Override
    public void print(){
        System.out.println(toString());
    }
}