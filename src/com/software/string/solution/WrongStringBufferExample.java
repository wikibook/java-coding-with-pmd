package com.software.string.solution;

public class WrongStringBufferExample {

    public static void main(String[] args) {
        StringBuffer testBuffer = new StringBuffer("String");
        testBuffer.append(System.getProperty("java.io.tmpdir"));
        testBuffer.append("String");
        testBuffer.append("Buffer");
        StringBuilder testBuilder = new StringBuilder("String");
        testBuilder.append(System.getProperty("java.io.tmpdir"));
        testBuilder.append("String");
        testBuilder.append("Builder");
    }
}