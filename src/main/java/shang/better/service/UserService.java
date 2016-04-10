package shang.better.service;

import java.util.List;

import shang.better.model.UserInfo;
import shang.better.model.Waiter;

public interface UserService {
	
	UserInfo getUserById(int id);
	
	List<UserInfo> getAllUsers();
	
	List<Waiter> getUsers();
	
	int insert(UserInfo userInfo);

}
