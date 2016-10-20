package com.shang.order.service;

import java.util.List;
import com.shang.order.util.Page;
import com.shang.order.exception.ServiceException;
import com.shang.order.domain.UserInfoDO;
 /**
 *  Service
 * @author haisheng.long 2016-06-22 15:38:37
 */
public interface UserInfoService {


	/**
	 * 根据   动态返回记录数
	 * @param userInfoDO
	 * @return 记录数
	 * @throws ServiceException
	 */
	Long selectCountDynamic(UserInfoDO userInfoDO) throws ServiceException;

	/**
	 * 动态返回  列表
	 * @param userInfoDO
	 * @return List<UserInfoDO>
	 * @throws ServiceException
	 */
	List<UserInfoDO> selectDynamic(UserInfoDO userInfoDO) throws ServiceException;

	/**
	 * 动态返回  分页列表
	 * @param userInfoDO
	 * @return Page<UserInfoDO>
	 * @throws ServiceException
	 */
	Page<UserInfoDO> queryPageListByUserInfoDO(UserInfoDO userInfoDO);

	/**
	 * 动态返回  分页列表
	 * @param userInfoDO
	 * @param startPage 起始页
	 * @param pageSize 每页记录数
	 * @return Page<UserInfoDO>
	 * @throws ServiceException
	 */
	Page<UserInfoDO> queryPageListByUserInfoDOAndStartPageSize(UserInfoDO userInfoDO,int startPage,int pageSize);

}
