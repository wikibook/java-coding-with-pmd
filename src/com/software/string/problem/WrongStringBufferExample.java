package com.software.string.problem;

public class WrongStringBufferExample {

    public static void main(String[] args) {
        StringBuffer testBuffer = new StringBuffer("String" + System.getProperty("java.io.tmpdir"));
        testBuffer.append("String" + "Buffer");
        StringBuilder testBuilder = new StringBuilder("String" + System.getProperty("java.io.tmpdir"));
        testBuilder.append("String" + "Builder");
    }
}