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
        //메소드 내의 모든 괄호는 제어문과 같은 라인에 존재한다.
        while (x == y) {
            something();
            somethingelse();
     
            if (status) {
                do_correct();
            } else
                continue_as_usual();//else가 한 줄의 코드만 포함하면 괄호 생략이 가능하다.
        }
     
        finalthing();
        
    }
}