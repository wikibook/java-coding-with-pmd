package com.software.comment.solution.view;

import com.software.comment.solution.controller.ExampleController;
import com.software.comment.solution.controller.ExampleControllerImpl;
import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleView.java
 * @Description : ���� �� Ŭ���� XXXXX
 * @Modification Information
 * @
 * @  ������      ������            ��������
 * @ 2013.09.09  �躴��          ���� ����
 *
 *  @author �躴��
 *  @since 2013.09.09
 *  @version 1.0 
 */
public class ExampleView {

	private ExampleController controller;
	
	/**
	 * ������
	 */
	public ExampleView() {
		controller = new ExampleControllerImpl();
	}
	
	/**
	 * ���� ��ȸ
	 * @param vo
	 * @return ��ȸ ���
	 */
	public ExampleVO view(ExampleVO vo) {
		return controller.view(vo);
	}

	/**
	 * ���� ����
	 * @param vo
	 * @return ���� ���
	 */
	public boolean insert(ExampleVO vo) {
		return controller.insert(vo);
	}

	/**
	 * ���� ����
	 * @param vo
	 * @return ���� ���
	 */
	public boolean update(ExampleVO vo) {
		return controller.update(vo);
	}

	/**
	 * ���� ����
	 * @param vo
	 * @return ���� ���
	 */
	public boolean delete(ExampleVO vo) {
		return controller.delete(vo);
	}
}
