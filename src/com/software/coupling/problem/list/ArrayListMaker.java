package com.software.coupling.problem.list;

import java.util.ArrayList;

public class ArrayListMaker {

    public ArrayList<String> make(ArrayList<String> arrayList) {
        arrayList.add("t");
        arrayList.add("e");
        arrayList.add("s");
        arrayList.add("t");
        return arrayList;
    }
}