package com.software.design.problem.dcl;
public class Foo {
    Object baz;
    Object bar() {
        if (baz == null) { // baz �� ���� �����ϰ� ������ ���� �ƴϴ�.
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        return baz;
    }
}