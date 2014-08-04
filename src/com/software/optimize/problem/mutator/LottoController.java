package com.software.optimize.problem.mutator;

import java.util.Date;

/**
 * @����: �ζ� API Ŭ����
 * @����: Ŭ������ ������ �����ϱ� ���ؼ� ��� Ŭ������ ���
 * @author Byeongseon
 * 2014. 2. 4.
 */
public final class LottoController {

    //���� ������ ���ѵǰ� ����� ��ϵ� �ζ� ������
    private final Date closingDate;
    
    //���� ������ ���ѵǰ� ����� ��ϵ� �ζ� ��ȣ �迭
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
