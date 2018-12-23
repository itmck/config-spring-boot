package com.qf.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qf.web.MyFilter;
import com.qf.web.MyServlet;

/**
 * 
 * 	将自定义的Servlet交给Spring容器去管理
 * 
 * 	过滤器同Servlet
 * 
 * @author 34745
 *
 */
@Configuration
public class MyServletConfig {

	/**
	 * 
	 * 	将自定义的Servlet交给Spring容器
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getMyServlet() {

		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/my");
		return servletRegistrationBean;

	}
	/**
	 * 
	 * 	将自定义的Filter交给Spring容器
	 * 
	 * @return
	 */
	@Bean
	public FilterRegistrationBean getMyFilter() {
		
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

}
