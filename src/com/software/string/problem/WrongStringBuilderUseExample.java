package com.software.string.problem;

public class WrongStringBuilderUseExample {

    //StringBuffer�� StringBuilder�� Ŭ���� �ɹ� ������ ����ϸ�
    //��ð� Ŭ���� �ν��Ͻ��� �����Ҽ��� �޸� ������ ���ɼ��� ��������.
    private StringBuilder strBuilder = new StringBuilder();
    private StringBuffer strBuffer = new StringBuffer();
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
    
        //append�� �����ؼ� ����ϸ� �޼ҵ� ü���� �߻��Ǿ� ���� ���ɼ��� �����Ѵ�.
        builder.append("abc").append("def").append("123");

        //StringBuilder ��ü�� length �޼ҵ尡 �����Ѵ�.
        //toString�� ���ʿ��� �ν��Ͻ��� �����Ѵ�.
        System.out.println("StringBuilder�� ���̴� : " +builder.toString().length());

        
        StringBuffer buffer = new StringBuffer();
        
        //������ ���ڿ��� �и��ؼ� �Է��ϴ� ���� ��ȿ�����̴�.
        buffer.append("Hello").append(" ").append("World");
        
        buffer.append("<xml>").append("<head>").append(httpRequest.getHeaderInfo()).append("</head><data>").append(dataDao.getList());

        //StringBuilder ��ü�� length �޼ҵ尡 �����Ѵ�.
        //toString�� ���ʿ��� �ν��Ͻ��� �����Ѵ�.
        System.out.println("StringBuffer�� ���̴� : " +buffer.toString().length());
    }
}