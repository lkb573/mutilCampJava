package com.multicampus.biz.user;

public class UserServiceClient {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl(new UserDAO());
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if (user != null) {
			System.out.println(user.getName() + "님 로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
