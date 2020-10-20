package com.multicampus.biz.board;

import java.util.List;

public class BoardServiceClient {
	public static void main(String[] args) {
		//1. 비즈니스 컴포넌트를 생성한다
		BoardService boardService = new BoardServiceImpl(new BoardDAO());
		
		//2. 비즈니스 메소드를 테스트 한다
		BoardVO vo = new BoardVO();
		vo.setTitle("JDBC 등록");
		vo.setWriter("테스터");
		vo.setContent("JDCB등록 테스트");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
	}
}
