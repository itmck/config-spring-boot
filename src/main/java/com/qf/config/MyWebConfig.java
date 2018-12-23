package com.qf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.qf.Interceptor.MyInterceptor;
/**
 * 
 * 	自定义配置类 @Configuration 让此类作为配置类启动,并让Spring扫描到
 * @author 34745
 *
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter{

	@Bean//将自定义的拦截器交给IoC容器
	public MyInterceptor getMyInterceptor() {
		return new MyInterceptor();
	}

	/**
	 * 
	 * 	配置拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration interceptor = registry.addInterceptor(getMyInterceptor());
		interceptor.addPathPatterns("/**");//拦截所有路径
		interceptor.excludePathPatterns("/index");//不拦截的路径

	}

}
