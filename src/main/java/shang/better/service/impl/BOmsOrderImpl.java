package shang.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.BOmsOrderMapper;
import shang.better.model.BOmsOrder;
import shang.better.service.BOmsOrderService;

@Service("bOmsOrderService")
public class BOmsOrderImpl implements BOmsOrderService {
	
	@Autowired
	BOmsOrderMapper bOmsOrderMapper;

	@Override
	public BOmsOrder selectBOmsOrderById(int id) {
		return bOmsOrderMapper.selectBOmsOrderById(id);
	}

}
