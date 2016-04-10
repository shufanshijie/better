package shang.better.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import shang.better.model.UserInfo;
import shang.better.model.Waiter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	
//	@Test
	public void testQueryById1() {
		UserInfo userInfo = userService.getUserById(1);
		System.out.println(JSON.toJSON(userInfo));
		LOGGER.info(JSON.toJSON(userInfo));
	}

//	@Test
	public void testQueryAll() {
		List<UserInfo> userInfos = userService.getAllUsers();
		LOGGER.info(JSON.toJSON(userInfos));
	}
	
	@Test
	public void testGetAll() {
		List<Waiter> userInfos = userService.getUsers();
		LOGGER.info(JSON.toJSON(userInfos));
	}

//	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(2);
		userInfo.setUserName("小红");
		userInfo.setUserCode("xiaohong");
		int result = userService.insert(userInfo);
		System.out.println(result);
	}
}
