package com.qf.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * 	自定义过滤器 (拦截器并不能拦截静态资源 jsp html等 所以有时候会使用过滤器)
 * 
 * @author 34745
 *
 */
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("过滤器初始化调用此方法......................");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("开始过滤..........................");
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		System.out.println("过滤器销毁调用此方法......................");
		
	}
	

	

}
