package shang.better.service;

import shang.better.model.TOmsOrderDtl;

public interface OmsOrderDtlService {
	
	int insert(TOmsOrderDtl record);

    int insertSelective(TOmsOrderDtl record);

    TOmsOrderDtl selectTOmsOrderDtlById(int id);
}
