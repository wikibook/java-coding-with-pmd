package com.software.naming.problem;

public class WrongConstantExample {
    private static final String name		= "name"; //����� �ҹ��� ��� (X)
    private static final String USERnAME	= "name"; //�߸��� �ܾ ���� (X)
    private static final String U$ER_NAME	= "name"; //�޷� ��ȣ��$�� ��� (X)
    private String USER_NAME = "name"; //Ŭ���� �ɹ� ������ ��������� ���� (X)
}