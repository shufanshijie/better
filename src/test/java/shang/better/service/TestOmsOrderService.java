package shang.better.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import shang.better.model.TOmsOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestOmsOrderService {

	private static final Logger LOGGER = Logger.getLogger(TestOmsOrderService.class);
	
	@Autowired
	private OmsOrderService omsOrderService;

	@Test
	public void testInsert() {
		TOmsOrder order = new TOmsOrder();
		order.setId(2);
		order.setLotNo(1);
		order.setOrderName("order2");
		int result = omsOrderService.insert(order);
		LOGGER.info(result);
		System.out.println(result);
	}
}
