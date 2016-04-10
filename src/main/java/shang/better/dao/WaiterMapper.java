package shang.better.dao;

import shang.better.model.Waiter;

public interface WaiterMapper {
    int insert(Waiter record);

    int insertSelective(Waiter record);
}