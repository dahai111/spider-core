package com.spider.core.util;

import org.springframework.context.ApplicationContext;

/**
 * spring  ApplicationContext工具类
 * @author zhangqiuping
 *
 */
public class ApplicationContextUtil {
	
	
	private static  ApplicationContext applicationContext;
	
	public static ApplicationContext get(){
		return applicationContext;
	}
	
	public static void set(ApplicationContext parent){
		applicationContext = parent;
	}

}
