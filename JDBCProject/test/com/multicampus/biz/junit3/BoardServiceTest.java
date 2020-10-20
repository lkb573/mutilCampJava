package com.multicampus.biz.junit3;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardServiceImpl;
import com.multicampus.biz.board.BoardVO;

import junit.framework.TestCase;

public class BoardServiceTest extends TestCase {

	private BoardService boardService;
	
	protected void setUp() throws Exception {
		BoardDAO boardDAO = new BoardDAO();
		boardService = new BoardServiceImpl(boardDAO);
	}

	protected void tearDown() throws Exception {
		boardService = null;
	}

	public void testInsertBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test...");
		int beforeCnt = boardService.getBoardList(vo).size();
		boardService.insertBoard(vo);
		int afterCnt = boardService.getBoardList(vo).size();
		assertEquals(beforeCnt, afterCnt-1 );
	}

	public void testGetBoard() {
		BoardVO vo = new BoardVO();
		vo.setSeq(1);
		BoardVO board = boardService.getBoard(vo);
		assertNotNull(board);
		assertEquals(1, board.getSeq());
	}

}
