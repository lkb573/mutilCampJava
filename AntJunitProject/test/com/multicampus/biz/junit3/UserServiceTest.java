package com.multicampus.biz.junit3;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.UserServiceImpl;
import com.multicampus.biz.user.UserVO;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
	private UserService userService;

	protected void setUp() throws Exception {
		userService = new UserServiceImpl(new UserDAO());
	}

	protected void tearDown() throws Exception {
		userService = null;
	}

	public void testGetUser() {
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		UserVO user = userService.getUser(vo);
		assertNotNull(user);
	}

}
