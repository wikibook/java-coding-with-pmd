package com.software.coupling.solution.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class LoosingCouplingExample {
    public static void main(String[] args) {
    	ListMaker listMaker = new ListMaker();
    	/*
    	 * List 인터페이스로 변수를 선언하여
    	 * List 인터페이스를 바탕으로 구현한 
    	 * 이 변수는 List 인터페이스를 바탕으로
    	 * 구현한 모든 객체를 받아들일 수 있다.
    	 */
    	List<String> list = new ArrayList<String>();
    	list = listMaker.make(list);
    	
    	list = new Vector<String>();
    	list = listMaker.make(list);
    	
        list = new LinkedList<String>();
        list = listMaker.make(list); 
        
        list = new Stack<String>();
        list = listMaker.make(list);
        
    }
}