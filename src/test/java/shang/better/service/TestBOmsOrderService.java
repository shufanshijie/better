package shang.better.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import shang.better.model.BOmsOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestBOmsOrderService {

	private static final Logger LOGGER = Logger.getLogger(TestBOmsOrderService.class);
	
	@Autowired
	private BOmsOrderService bOmsOrderService;

	@Test
	public void testSelect() {
		BOmsOrder result = bOmsOrderService.selectBOmsOrderById(1);
		LOGGER.info(JSON.toJSON(result));
		System.out.println(JSON.toJSON(result));
	}
}
