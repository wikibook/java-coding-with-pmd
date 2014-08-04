package com.software.string.solution;

public class WrongStringBuilderUseExample {

    //StringBuffer�� StringBuilder�� �ִ��� Ŭ���� �ɹ� ������ ������� �ʴ´�. 
    //private StringBuilder strBuilder = new StringBuilder();
    //private StringBuffer strBuffer = new StringBuffer();
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //StringBuilder ��ü�� length �޼ҵ带 ����Ѵ�.
        System.out.println("StringBuilder�� ���̴� : " +builder.length());

        
        StringBuffer buffer = new StringBuffer();
      //������ ���ڿ��� �ѹ��� �߰��Ѵ�.
        buffer.append("Hello World");
        
        //append�� �����ؼ� ����ϸ� �޼ҵ� ü���� �߻����� �ʵ��� 
        //append�� �����ؼ� ������� �ʴ´�.
        buffer.append(httpRequest.getHeaderInfo());
        buffer.append("</head><data>");
        buffer.append(dataDao.getList());

        //StringBuilder ��ü�� length �޼ҵ带 ����Ѵ�.
        System.out.println("StringBuffer�� ���̴� : " +buffer.length());
    }
}