package shang.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.TOmsOrderBatchMapper;
import shang.better.model.TOmsOrderBatch;
import shang.better.service.OmsOrderBatchService;

@Service("omsOrderBatchService")
public class OmsOrderBatchServiceImpl implements OmsOrderBatchService {
	
	@Autowired
	private TOmsOrderBatchMapper omsOrderMapper;

	@Override
	public int insert(TOmsOrderBatch record) {
		return omsOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(TOmsOrderBatch record) {
		return omsOrderMapper.insertSelective(record);
	}

	@Override
	public TOmsOrderBatch selectTOmsOrderBatchById(int id) {
		return omsOrderMapper.selectTOmsOrderBatchById(id);
	}

}
