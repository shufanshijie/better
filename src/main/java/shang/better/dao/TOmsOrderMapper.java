package shang.better.dao;

import shang.better.model.TOmsOrder;

public interface TOmsOrderMapper {
	
    int insert(TOmsOrder record);

    int insertSelective(TOmsOrder record);

    TOmsOrder selectTOmsOrderById(int id);

}