package shang.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.BOmsBatchOrderMapper;
import shang.better.model.BOmsBatchOrder;
import shang.better.service.BOmsBatchOrderService;

@Service("bOmsBatchOrderService")
public class BOmsBatchOrderImpl implements BOmsBatchOrderService {
	
	@Autowired
	BOmsBatchOrderMapper bOmsBatchOrderMapper;

	@Override
	public BOmsBatchOrder selectBOmsBatchOrderById(int id) {
		return bOmsBatchOrderMapper.selectBOmsBatchOrderById(id);
	}

}
