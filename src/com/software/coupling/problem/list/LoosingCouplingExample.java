package com.software.coupling.problem.list;

import java.util.ArrayList;
import java.util.Vector;


public class LoosingCouplingExample {
	private ArrayList list = new ArrayList();
    public static void main(String[] args) {
        VectorMaker vectorMaker = new VectorMaker();
        ArrayListMaker arrayListMaker = new ArrayListMaker();
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList = arrayListMaker.make(arrayList);
        
        Vector<String> vector = new Vector<String>(); 
        vector = vectorMaker.make(vector);
        
    }
}