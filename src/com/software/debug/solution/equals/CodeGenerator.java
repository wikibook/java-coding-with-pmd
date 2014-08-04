package com.software.debug.solution.equals;

public class CodeGenerator {

    /**
     * �Էµ� �޽����� �ش� �ڵ�� ��ȯ�Ͽ� ��ȯ�Ѵ�.
     * @param value �޽���
     * @return �ڵ�
     */
    public String toCode(String value) {
        
        String[][] codeMap = new String[][]{{"CODE001","�Ա�"},{"CODE002","���"},{"CODE003","��ȸ"}};
        
        String code = "ERROR";
        
        for(String[] map : codeMap) {
            if(map[1].equals(value)) {
                code = map[0];
            }
        }
        
        return code;
    }
}