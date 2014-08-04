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
    	 * List �������̽��� ������ �����Ͽ�
    	 * List �������̽��� �������� ������ 
    	 * �� ������ List �������̽��� ��������
    	 * ������ ��� ��ü�� �޾Ƶ��� �� �ִ�.
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