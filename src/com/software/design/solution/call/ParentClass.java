package com.software.design.solution.call;
public abstract class ParentClass {
    public ParentClass(){
        //toString�� �ڽ� Ŭ������ �������̵� �� �� �����Ƿ� 
        //�������̵� ������ �޼ҵ带 ȣ���ϴ� ������
        //��õ������ �����Ѵ�.
        toString();
        
        //print�� �ڽ� Ŭ������ ���� ������ ������ �����Ͽ����Ƿ�
        //�θ� �ڽ� Ŭ���� ���� �������̵� �浹�� �߻����� �ʴ´�.
        print();
    }
    
    protected abstract void print();
    
    public final String toString(){
        return "���� �θ��";
    }
}