package shang.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.TOmsOrderDtlMapper;
import shang.better.model.TOmsOrderDtl;
import shang.better.service.OmsOrderDtlService;

@Service("omsOrderDtlService")
public class OmsOrderDtlServiceImpl implements OmsOrderDtlService {
	
	@Autowired
	TOmsOrderDtlMapper tOmsOrderDtlMapper;

	@Override
	public int insert(TOmsOrderDtl record) {
		return tOmsOrderDtlMapper.insert(record);
	}

	@Override
	public int insertSelective(TOmsOrderDtl record) {
		return tOmsOrderDtlMapper.insertSelective(record);
	}

	@Override
	public TOmsOrderDtl selectTOmsOrderDtlById(int id) {
		return tOmsOrderDtlMapper.selectTOmsOrderDtlById(id);
	}


}
