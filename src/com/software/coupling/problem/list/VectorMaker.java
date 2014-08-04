package com.software.coupling.problem.list;

import java.util.Vector;

public class VectorMaker {

    public Vector<String> make(Vector<String> vector) {
        vector.add("t");
        vector.add("e");
        vector.add("s");
        vector.add("t");
        return vector;
    }
}