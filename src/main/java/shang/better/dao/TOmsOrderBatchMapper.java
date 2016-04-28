package shang.better.dao;

import shang.better.model.TOmsOrderBatch;

public interface TOmsOrderBatchMapper {
	
    int insert(TOmsOrderBatch record);

    int insertSelective(TOmsOrderBatch record);

    TOmsOrderBatch selectTOmsOrderBatchById(int id);

}