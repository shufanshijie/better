package shang.better.service;

import shang.better.model.BOmsOrder;

public interface BOmsOrderService {

	BOmsOrder selectBOmsOrderById(int id);
	
	int insert(BOmsOrder bOrder);
}
