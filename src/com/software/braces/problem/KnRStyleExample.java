package com.software.braces.problem;

public class KnRStyleExample
{
    private void something()
    {
        
    }
    
    private void somethingelse()
    {
        
    }
    
    private void finalthing()
    {
        
    }
    
    private void do_correct()
    {
    
    }
    
    private void continue_as_usual()
    {
        
    }
    
    public KnRStyleExample(boolean status, int x, int y) 
    {
        //�޼ҵ� ���� ��� ��ȣ�� ����� ���� ���ο� �����Ѵ�.
        while (x == y) {
            something();
            somethingelse();
     
            if (status) {
                do_correct();
            } else
                continue_as_usual();//else�� �� ���� �ڵ常 �����ϸ� ��ȣ ������ �����ϴ�.
        }
     
        finalthing();
        
    }
}