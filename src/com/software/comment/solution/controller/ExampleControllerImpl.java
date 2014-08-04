package com.software.comment.solution.controller;

import com.software.comment.solution.dao.ExampleDAO;
import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleControllerImpl.java
 * @Description : ���� Controller ���� Ŭ���� XXXXX
 * @Modification Information
 * @
 * @  ������      ������            ��������
 * @ 2013.09.09  �躴��          ���� ����
 *
 *  @author �躴��
 *  @since 2013.09.09
 *  @version 1.0 
 */
public class ExampleControllerImpl implements ExampleController{

	private ExampleDAO exampleDAO;
	
	/**
	 * ������
	 */
	public ExampleControllerImpl() {
		exampleDAO = new ExampleDAO();
	}
	
	@Override
	public ExampleVO view(ExampleVO vo) {
		return exampleDAO.view(vo);
	}

	@Override
	public boolean insert(ExampleVO vo) {
		return exampleDAO.insert(vo);
	}

	@Override
	public boolean update(ExampleVO vo) {
		return exampleDAO.update(vo);
	}

	@Override
	public boolean delete(ExampleVO vo) {
		return exampleDAO.delete(vo);
	}

}
