package com.shang.order.dao;

import java.util.List;
import com.shang.order.domain.UserInfoDO;
import com.shang.order.exception.DAOException;


 /**
 *  DAO
 * @author haisheng.Long 2016-06-22 15:38:37
 */
public interface UserInfoDAO {


	/**
	 * 根据   动态返回记录数
	 * @param userInfoDO
	 * @return 记录条数
	 * @throws DAOException
	 */
	Long selectCountDynamic(UserInfoDO userInfoDO) throws DAOException;

	/**
	 * 根据   动态返回  列表
	 * @param userInfoDO
	 * @return List<UserInfoDO>
	 * @throws DAOException
	 */
	List<UserInfoDO> selectDynamic(UserInfoDO userInfoDO) throws DAOException;

	/**
	 * 根据   动态返回  Limit 列表
	 * @param userInfoDO start,pageSize属性必须指定
	 * @return List<UserInfoDO>
	 * @throws DAOException
	 */
	List<UserInfoDO> selectDynamicPageQuery(UserInfoDO userInfoDO) throws DAOException;
}
