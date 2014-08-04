package com.software.naming.solution;
public class GenericsExample<T> {	// 

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T value){
        this.t = value;
    }

    public static void main(String args[]){
        GenericsExample<String> type = new GenericsExample<>();
        type.set("test"); //���

        GenericsExample type1 = new GenericsExample(); //raw type
        type1.set("Pankaj"); //���
        type1.set(10); //����ڽ� ����
        
        System.out.println(type1.get());
    }
}