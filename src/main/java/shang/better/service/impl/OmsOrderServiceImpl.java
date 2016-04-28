package shang.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.TOmsOrderMapper;
import shang.better.model.TOmsOrder;
import shang.better.service.OmsOrderService;

@Service("omsOrderService")
public class OmsOrderServiceImpl implements OmsOrderService {
	
	@Autowired
	private TOmsOrderMapper omsOrderMapper;

	@Override
	public int insert(TOmsOrder record) {
		return omsOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(TOmsOrder record) {
		return omsOrderMapper.insertSelective(record);
	}

	@Override
	public TOmsOrder selectTOmsOrderById(int id) {
		return omsOrderMapper.selectTOmsOrderById(id);
	}

}
