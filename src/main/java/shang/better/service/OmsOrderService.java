package shang.better.service;

import shang.better.model.TOmsOrder;

public interface OmsOrderService {
	
	int insert(TOmsOrder record);

    int insertSelective(TOmsOrder record);

    TOmsOrder selectTOmsOrderById(int id);
}
