package com.shang.order.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.shang.order.dao.UserInfoDAO;
import com.shang.order.domain.UserInfoDO;
import com.shang.order.service.UserInfoService;
import com.shang.order.exception.DAOException;
import com.shang.order.exception.ServiceException;
import com.shang.order.util.Page;

@Service(value="userInfoService")
public class UserInfoServiceImpl  implements UserInfoService{

	private Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	private UserInfoDAO userInfoDAO;

	

	@Override
	public Long selectCountDynamic(UserInfoDO userInfoDO) throws ServiceException {
		try {
			return userInfoDAO.selectCountDynamic(userInfoDO);
		}catch(DAOException e){
			logger.error(e);
            throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public List<UserInfoDO> selectDynamic(UserInfoDO userInfoDO) throws ServiceException {
		try {
			return userInfoDAO.selectDynamic(userInfoDO);
		}catch(DAOException e){
			logger.error(e);
            throw new ServiceException(e.getMessage(), e);
		}
	}
	

	private List<UserInfoDO> selectDynamicPageQuery(UserInfoDO userInfoDO) throws ServiceException {
		try {
			return userInfoDAO.selectDynamicPageQuery(userInfoDO);
		}catch(DAOException e){
			logger.error(e);
            throw new ServiceException(e.getMessage(), e);
		}
	}

	public Page<UserInfoDO> queryPageListByUserInfoDO(UserInfoDO userInfoDO) {
		if (null!=userInfoDO) {
			Long totalCount = this.selectCountDynamic(userInfoDO);
			List<UserInfoDO> results = this.selectDynamicPageQuery(userInfoDO);
			
			Page<UserInfoDO> page = new Page<UserInfoDO>();
			if(userInfoDO.getPageSize()>UserInfoDO.MAX_PAGE_SIZE){
				page.setPageSize(UserInfoDO.MAX_PAGE_SIZE);
			}else{
				page.setPageSize(userInfoDO.getPageSize());
			}
			page.setPageNo(userInfoDO.getStartPage());
			page.setTotalCount(totalCount.intValue());
			page.setResultList(results);
			return page;
		}
		return new Page<UserInfoDO>();
	}

	public Page<UserInfoDO> queryPageListByUserInfoDOAndStartPageSize(UserInfoDO userInfoDO,int startPage,int pageSize){
		if (null!=userInfoDO  && startPage>0 && pageSize>0) {
			if(pageSize >UserInfoDO.MAX_PAGE_SIZE){ 
				pageSize = UserInfoDO.MAX_PAGE_SIZE;
			}
			userInfoDO.setStartPage(startPage);
			userInfoDO.setPageSize(pageSize);
			return this.queryPageListByUserInfoDO(userInfoDO);
		}
		return new Page<UserInfoDO>();
	}

}
