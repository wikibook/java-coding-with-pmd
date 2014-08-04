package com.software.design.problem.dcl;
public class Foo {
    Object baz;
    Object bar() {
        if (baz == null) { // baz 는 아직 완전하게 생성된 것이 아니다.
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        return baz;
    }
}