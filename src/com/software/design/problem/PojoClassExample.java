package com.software.design.problem;

//import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
/**
 * �������� DI�� �Ϲ����� POJO�� �״�� Ȱ���ϸ�
 * �ܼ��� ������̼�(Annotation)�� �����ϴ� ������ �����ϴ�.
 * @author Byeongseon
 *
 */
//@Component("pojoClassExample")
public class PojoClassExample {
    public boolean isEmpty(String value) {
        return value == null || value.isEmpty() ? true : false;
    }
    
    public String changeMoney(String str) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(Integer.valueOf(str));
    }

}
