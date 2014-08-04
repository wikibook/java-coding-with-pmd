package com.software.optimize.solution.mutator;

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
        this.lotto = new int[lotto.length];
        
        //system.arraycopy�� �̿��Ͽ� �迭�� ��� �����Ѵ�.
        System.arraycopy(lotto, 0, this.lotto, 0, lotto.length);
        
        //���� ��ü�� ���� �������� ���ο� �ν��Ͻ��� �����ϴ� ��� ���縦 �Ѵ�.
        this.closingDate = new Date(closingDate.getTime());
    }
    
    
    public Date getClosingDate() {
        //�ܼ��� ��ü�� �ٷ� �����ϴ� ���� �ƴ�
        //���� �ʵ带 ���� �����Ͽ� �����Ѵ�.
        return new Date(closingDate.getTime());
    }
    
    public int[] getLotto() {
        //�ܼ��� ��ü�� �ٷ� �����ϴ� ���� �ƴ�
        //���� �ʵ带 ���� �����Ͽ� �����Ѵ�.
        return this.lotto.clone();
    }
    
}
