package com.software.braces.problem;

public class OTBSExample {
    private void something() {

    }

    private void somethingelse() {

    }

    private void finalthing() {

    }

    private void do_correct() {

    }

    private void continue_as_usual() {

    }

    public OTBSExample(boolean status, int x, int y) {
        // �޼ҵ� ���� ��� ��ȣ�� ����� ���� ���ο� �����Ѵ�.
        while (x == y) {
            something();
            somethingelse();

            if (status) {
                do_correct();
            } else {
                // else�� �� ���� �ڵ常 �����ϴ��� ������  ��ȣ�� ����Ѵ�.
                continue_as_usual();
            }
        }
        finalthing();
    }
}
