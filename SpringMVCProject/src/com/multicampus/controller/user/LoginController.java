package com.multicampus.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserVO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(@ModelAttribute("user") UserVO vo) throws Exception {
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO) throws Exception {
		if(userDAO.getUser(vo) != null) return "getBoardList.do";
		else return "login.jsp";
	}
	
	@RequestMapping(value="/loginout.do")
	public String loginout(HttpSession session) throws Exception {
		//로그아웃 요청한 브라우저와 매핑된 세션을 메모리에서 강제 종료
		session.invalidate();
		
		//로그아웃 후에는 메인 페이지로 이동
		return "index.jsp";
	}

}








