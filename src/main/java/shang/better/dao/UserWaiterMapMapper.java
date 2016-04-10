package shang.better.dao;

import shang.better.model.UserWaiterMap;

public interface UserWaiterMapMapper {
    int insert(UserWaiterMap record);

    int insertSelective(UserWaiterMap record);
}