package com.software.design.problem;

//import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
/**
 * 스프링의 DI는 일반적인 POJO를 그대로 활용하며
 * 단순히 어노테이션(Annotation)을 적용하는 것으로 가능하다.
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
