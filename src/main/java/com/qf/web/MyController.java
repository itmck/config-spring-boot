package com.qf.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@RequestMapping(value="hello")
	public  String  hello() {
		
		return "hello";
	}
	@RequestMapping(value="index")
	public  String index() {
		
		return "index";
	}
	@RequestMapping(value="login/{uname}/{upwd}")
	public  String login(@PathVariable(name="uname") String uname,@PathVariable(name="upwd") String upwd,HttpServletRequest request) {
		if("mck".equals(uname)&&"123".equals(upwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("upwd", upwd);
		}
		
		return "login info:"+uname+" "+upwd;
	}
	
	

}
