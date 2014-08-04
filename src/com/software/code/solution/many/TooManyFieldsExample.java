package com.software.code.solution.many;

public class TooManyFieldsExample {
    
    //각 유형별로 변수를 각각의 변수 객체로 묶어서 가독성을 향상시키자.
    private UserVO userVO;
    
    private DocumentVO documentVO;
    
    private EtcVO etcVO;
    
    public static void main(String[] args) {
        
    }
    
    /*
     * 3개 이상의 전달 인자는 가변인자를 사용해서 가독성을 향상시킬 수 있으며
     * 가변인자를 사용하므로 불필요한 메소드 오버로딩을 할 필요가 없다.
     * 단, 가변인자를 사용할 시 오류를 방지하기 위해서 첫번째 인자는 일반 전달인자로 받아야 한다.
     */

    public static void tooManyParameterList(String text0, String ... texts) {
        
    }
}