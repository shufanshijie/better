package shang.better.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shang.better.dao.UserInfoMapper;
import shang.better.model.UserInfo;
import shang.better.model.Waiter;
import shang.better.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectUserInfoById(id);
	}

	@Override
	public List<UserInfo> getAllUsers() {
		return userInfoMapper.selectAllUsers();
	}
	
	@Override
	public List<Waiter> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		int result = userInfoMapper.insert(userInfo);
		return result;
	}

}
