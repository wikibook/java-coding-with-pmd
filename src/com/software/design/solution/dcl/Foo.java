package com.software.design.solution.dcl;
public class Foo {
    Object baz;
    Object bar() {
        synchronized(this) {
            if (baz == null) {
                baz = new Object();
            }
        }
        return baz;
    }
}