package shang.better.dao;

import java.util.List;

import shang.better.model.UserInfo;
import shang.better.model.Waiter;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

	UserInfo selectUserInfoById(int id);

	List<UserInfo> selectAllUsers();

	List<Waiter> selectAll();
}