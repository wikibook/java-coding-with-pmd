package com.software.optimize.solution.mutator;

import java.util.Date;

/**
 * @제목: 로또 API 클래스
 * @설명: 클래스의 변경을 방지하기 위해서 상수 클래스로 등록
 * @author Byeongseon
 * 2014. 2. 4.
 */
public final class LottoController {

    //직접 접근이 제한되고 상수로 등록된 로또 마감일
    private final Date closingDate;
    
    //직접 접근이 제한되고 상수로 등록된 로또 번호 배열
    private final int[] lotto;
    
    public LottoController(int[] lotto, Date closingDate) {
        this.lotto = new int[lotto.length];
        
        //system.arraycopy를 이용하여 배열을 방어 복사한다.
        System.arraycopy(lotto, 0, this.lotto, 0, lotto.length);
        
        //원본 객체의 값을 바탕으로 새로운 인스턴스를 생성하는 방어 복사를 한다.
        this.closingDate = new Date(closingDate.getTime());
    }
    
    
    public Date getClosingDate() {
        //단순히 객체를 바로 전달하는 것이 아닌
        //내부 필드를 복재 생산하여 전달한다.
        return new Date(closingDate.getTime());
    }
    
    public int[] getLotto() {
        //단순히 객체를 바로 전달하는 것이 아닌
        //내부 필드를 복재 생산하여 전달한다.
        return this.lotto.clone();
    }
    
}
