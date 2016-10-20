package com.shang.order.controller;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.shang.order.domain.UserInfoDO;
import com.shang.order.service.UserInfoService;
import com.shang.order.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;


	@RequestMapping(value="userInfo/list")
	public String list(@ModelAttribute("userInfo") UserInfoDO userInfo,final ModelMap model,WebRequest request) {
		if(userInfo==null){
			userInfo=new UserInfoDO();
		}
		int startPage=Integer.valueOf(StringUtils.isNotBlank(request.getParameter("pageNo"))?request.getParameter("pageNo"):"1");
		int pageSize=20;
		Page<UserInfoDO> page=userInfoService.queryPageListByUserInfoDOAndStartPageSize(userInfo,startPage,pageSize);

		model.addAttribute("page", page);
		return "userInfo/list";
	}

	@RequestMapping(value="test")
	public String test(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("hahahha");;
		return "index.jsp";
	}

}
