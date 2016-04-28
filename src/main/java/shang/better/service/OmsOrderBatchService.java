package shang.better.service;

import shang.better.model.TOmsOrderBatch;

public interface OmsOrderBatchService {
	
	int insert(TOmsOrderBatch record);

    int insertSelective(TOmsOrderBatch record);

    TOmsOrderBatch selectTOmsOrderBatchById(int id);
}
