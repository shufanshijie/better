package shang.better.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import shang.better.model.BOmsBatchOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestBOmsBatchOrderService {

	private static final Logger LOGGER = Logger.getLogger(TestBOmsBatchOrderService.class);
	
	@Autowired
	private BOmsBatchOrderService bOmsBatchOrderService;

	@Test
	public void testSelect() {
		BOmsBatchOrder result = bOmsBatchOrderService.selectBOmsBatchOrderById(1);
		LOGGER.info(JSON.toJSON(result));
		System.out.println(JSON.toJSON(result));
	}
}
