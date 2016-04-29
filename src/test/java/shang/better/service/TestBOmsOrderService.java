package shang.better.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import shang.better.model.BOmsOrder;
import shang.better.model.TOmsOrder;
import shang.better.model.TOmsOrderDtl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestBOmsOrderService {

	private static final Logger LOGGER = Logger.getLogger(TestBOmsOrderService.class);
	
	@Autowired
	private BOmsOrderService bOmsOrderService;

//	@Test
	public void testSelect() {
		BOmsOrder result = bOmsOrderService.selectBOmsOrderById(1);
		LOGGER.info(JSON.toJSON(result));
		System.out.println(JSON.toJSON(result));
	}
	
	@Test
	public void testInsert(){
		BOmsOrder bOrder = new BOmsOrder();
		TOmsOrder order = new TOmsOrder();
		int orderId = 4;
		int lotNo = 2;
		order.setId(orderId);
		order.setLotNo(lotNo);
		order.setOrderName("order3");
		bOrder.setOrder(order);
		bOrder.setId(orderId);
		List<TOmsOrderDtl> orderDtls = new ArrayList<TOmsOrderDtl>();
		int start = 7;
		for(int i=0 ;i<2;i++){
			TOmsOrderDtl orderDtl = new TOmsOrderDtl();
			orderDtl.setId(start+i);
			orderDtl.setLotNo(lotNo);
			orderDtl.setOrderId(orderId);
			orderDtl.setProductId(start+i);
			orderDtl.setProductName("product"+(start+i));
			orderDtls.add(orderDtl);
		}
		bOrder.setOrderDtls(orderDtls);
		int result = bOmsOrderService.insert(bOrder);
		System.out.println(result);
	}
}
