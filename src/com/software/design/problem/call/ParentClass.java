package com.software.design.problem.call;
public class ParentClass {
    public ParentClass(){
        //toString�� �ڽ� Ŭ�������� �������̵� ���� ��� 
        //NullPointerException�� �߻��� ���ɼ��� �ִ�.
        toString();
    }
    public String toString(){
        return "���� �θ��";
    }
}