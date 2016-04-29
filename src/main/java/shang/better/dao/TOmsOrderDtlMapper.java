package shang.better.dao;

import shang.better.model.TOmsOrderDtl;

public interface TOmsOrderDtlMapper {
	
    int insert(TOmsOrderDtl record);

    int insertSelective(TOmsOrderDtl record);

    TOmsOrderDtl selectTOmsOrderDtlById(int id);

}