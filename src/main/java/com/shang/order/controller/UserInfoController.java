package com.shang.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserInfoController {

	@RequestMapping(value="test")
	public String test(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("hahahha");
		return "index.jsp";
	}

}
