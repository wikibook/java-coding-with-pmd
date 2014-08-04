package com.software.comment.solution.controller;

import com.software.comment.solution.dao.ExampleDAO;
import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleControllerImpl.java
 * @Description : 예제 Controller 구현 클래스 XXXXX
 * @Modification Information
 * @
 * @  수정일      수정자            수정내용
 * @ 2013.09.09  배병선          최초 생성
 *
 *  @author 배병선
 *  @since 2013.09.09
 *  @version 1.0 
 */
public class ExampleControllerImpl implements ExampleController{

	private ExampleDAO exampleDAO;
	
	/**
	 * 생성자
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
