package com.software.comment.solution.view;

import com.software.comment.solution.controller.ExampleController;
import com.software.comment.solution.controller.ExampleControllerImpl;
import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleView.java
 * @Description : 예제 뷰 클래스 XXXXX
 * @Modification Information
 * @
 * @  수정일      수정자            수정내용
 * @ 2013.09.09  배병선          최초 생성
 *
 *  @author 배병선
 *  @since 2013.09.09
 *  @version 1.0 
 */
public class ExampleView {

	private ExampleController controller;
	
	/**
	 * 생성자
	 */
	public ExampleView() {
		controller = new ExampleControllerImpl();
	}
	
	/**
	 * 예제 조회
	 * @param vo
	 * @return 조회 결과
	 */
	public ExampleVO view(ExampleVO vo) {
		return controller.view(vo);
	}

	/**
	 * 예제 저장
	 * @param vo
	 * @return 저장 결과
	 */
	public boolean insert(ExampleVO vo) {
		return controller.insert(vo);
	}

	/**
	 * 예제 수정
	 * @param vo
	 * @return 수정 결과
	 */
	public boolean update(ExampleVO vo) {
		return controller.update(vo);
	}

	/**
	 * 예제 삭제
	 * @param vo
	 * @return 삭제 결과
	 */
	public boolean delete(ExampleVO vo) {
		return controller.delete(vo);
	}
}
