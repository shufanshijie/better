package shang.better.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import shang.better.model.TOmsOrderDtl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestOmsOrderDtlService {

	private static final Logger LOGGER = Logger.getLogger(TestOmsOrderDtlService.class);
	
	@Autowired
	private OmsOrderDtlService omsOrderDtlService;

	@Test
	public void testInsert() {
		TOmsOrderDtl orderDtl = new TOmsOrderDtl();
		orderDtl.setId(4);
		orderDtl.setOrderId(2);
		orderDtl.setProductId(4);
		orderDtl.setProductName("product4");
		orderDtl.setLotNo(1);
		int result = omsOrderDtlService.insert(orderDtl);
		LOGGER.info(result);
		System.out.println(result);
	}
}
