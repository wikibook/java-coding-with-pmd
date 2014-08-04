package com.software.comment.solution.controller;

import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleController.java
 * @Description : ���� Controller �������̽� XXXXX
 * @Modification Information
 * @
 * @  ������      ������            ��������
 * @ 2013.09.09  �躴��          ���� ����
 *
 *  @author �躴��
 *  @since 2013.09.09
 *  @version 1.0 
 */
public interface ExampleController {
	
	/**
	 * ��ȸ �޼ҵ�
	 * @param vo
	 * @return ���� VO�� ��ȯ
	 */
	ExampleVO view(ExampleVO vo);
	
	/**
	 * ��� �޼ҵ�
	 * @param vo
	 * @return ��� ��� ��ȯ
	 */
	boolean insert(ExampleVO vo);
	
	/**
	 * ���� �޼ҵ�
	 * @param vo
	 * @return ���� ��� ��ȯ
	 */
	boolean update(ExampleVO vo);
	
	/**
	 * ���� �޼ҵ�
	 * @param vo
	 * @return ���� ��� ��ȯ
	 */
	boolean delete(ExampleVO vo);
}
