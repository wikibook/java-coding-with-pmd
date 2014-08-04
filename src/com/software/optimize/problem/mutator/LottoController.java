package com.software.optimize.problem.mutator;

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
        this.lotto = lotto;
        this.closingDate = closingDate;
    }
    
    
    public Date getClosingDate() {
        return this.closingDate;
    }
    
    public int[] getLotto() {
        return this.lotto;
    }
    
}
