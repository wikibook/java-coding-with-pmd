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
        type.set("test"); //허용

        GenericsExample type1 = new GenericsExample(); //raw type
        type1.set("Pankaj"); //허용
        type1.set(10); //오토박싱 지원
        
        System.out.println(type1.get());
    }
}