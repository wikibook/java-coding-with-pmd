package com.software.basic.problem;

public class SwitchExample {

    public static void main(String[] args) {
        
String fruit = "apple";

switch(fruit) {
    case "apple":
        System.out.println("사과");
        break;
    case "pear": 
        System.out.println("배");
        break;
    case "orange":
        System.out.println("오랜지");
        break;
    case "mandarin":
        System.out.println("귤");
        break;
    default :
        System.out.println("과일");
        break;
}
    }
}
