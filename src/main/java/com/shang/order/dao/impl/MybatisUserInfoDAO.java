package com.shang.order.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.shang.order.dao.UserInfoDAO;
import com.shang.order.domain.UserInfoDO;
import com.shang.order.exception.DAOException;

@Repository(value="userInfoDAO")
public class MybatisUserInfoDAO extends MybatisBaseDAO implements UserInfoDAO {

	public Long selectCountDynamic(UserInfoDO userInfoDO) throws DAOException {
		try{
			return getSqlSession().selectOne("com.shang.order.domain.UserInfoMapper.MybatisUserInfoDAO_select_dynamic_count", userInfoDO);
		}catch (Exception e) {
			throw new DAOException(e.getMessage(), e);
		}
	}

	public List<UserInfoDO> selectDynamic(UserInfoDO userInfoDO) throws DAOException {
		try{
			return getSqlSession().selectList("com.shang.order.domain.UserInfoMapper.MybatisUserInfoDAO_select_dynamic", userInfoDO);
		}catch (Exception e) {
			throw new DAOException(e.getMessage(), e);
		}
	}

	public List<UserInfoDO> selectDynamicPageQuery(UserInfoDO userInfoDO) throws DAOException {
		try{
			return getSqlSession().selectList("com.shang.order.domain.UserInfoMapper.MybatisUserInfoDAO_select_dynamic_page_query", userInfoDO);
		}catch (Exception e) {
			throw new DAOException(e.getMessage(), e);
		}
	}

}
