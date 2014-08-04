package com.software.debug.solution.equals;

public class CodeGenerator {

    /**
     * 입력된 메시지를 해당 코드로 변환하여 반환한다.
     * @param value 메시지
     * @return 코드
     */
    public String toCode(String value) {
        
        String[][] codeMap = new String[][]{{"CODE001","입금"},{"CODE002","출금"},{"CODE003","조회"}};
        
        String code = "ERROR";
        
        for(String[] map : codeMap) {
            if(map[1].equals(value)) {
                code = map[0];
            }
        }
        
        return code;
    }
}