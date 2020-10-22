package com.multicampus.biz.user;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardVO;

public class UserServiceClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("business-layer.xml");
		
		UserService userService = (UserService) container.getBean("userService");
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "님 로그인 성공^^");
			
			System.out.println("[ BOARD LIST ]");
			List<BoardVO> boardList = boardService.getBoardList(new BoardVO());
			for (BoardVO board : boardList) {
				System.out.println("---> " + board.toString());
			}
		} else 
			System.out.println("로그인 실패");
		
		container.close();
	}
}
