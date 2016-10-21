package com.shang.order.record;

/**
* 
* @author haisheng.long Wed Jun 22 15:38:37 CST 2016
*/

public class UserInfoDO extends BaseDO {

/**  */
private Integer id;

/**  */
private String userName;

/**  */
private String userCode;

/**
* 设置 
* @param id
*/
	public void setId(Integer id) {
	this.id = id;
}
/**
* 设置 
* @param userName
*/
	public void setUserName(String userName) {
	this.userName = userName;
}
/**
* 设置 
* @param userCode
*/
	public void setUserCode(String userCode) {
	this.userCode = userCode;
}
/**
* 获取 
* @return id
*/
	public Integer getId() {
	return id;
}
/**
* 获取 
* @return userName
*/
	public String getUserName() {
	return userName;
}
/**
* 获取 
* @return userCode
*/
	public String getUserCode() {
	return userCode;
}

}