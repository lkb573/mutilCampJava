package com.multicampus.biz.junit4;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.UserServiceImpl;
import com.multicampus.biz.user.UserVO;

public class UserServiceTest {
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
		userService = new UserServiceImpl(new UserDAO());
	}

	@After
	public void tearDown() throws Exception {
		userService = null;
	}

	@Test
	public void testGetUser() {
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		UserVO user = userService.getUser(vo);
		assertNotNull(user);
	}

}
