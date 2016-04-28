package shang.better.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import shang.better.model.TOmsOrderBatch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestOmsOrderBatchService {

	private static final Logger LOGGER = Logger.getLogger(TestOmsOrderBatchService.class);
	
	@Autowired
	private OmsOrderBatchService omsOrderBatchService;

	@Test
	public void testInsert() {
		TOmsOrderBatch order = new TOmsOrderBatch();
		order.setId(1);
		order.setBatchName("batch1");;
		int result = omsOrderBatchService.insert(order);
		LOGGER.info(result);
		System.out.println(result);
	}
}
