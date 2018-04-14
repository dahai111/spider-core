/*
 * 文件名：SeleniumFactory.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年4月12日 上午9:03:38 修改内容：新增
 */
package com.spider.core.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * selenium 对象工厂
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年4月12日 上午9:03:38
 */
public class SeleniumFactory
{
	
	/**
	 * 调测日志记录器。
	 */
	private static final Logger LOG = LoggerFactory.getLogger(SeleniumFactory.class);
	
	public static WebDriver createChromeWebDriver()
	{
		
		LOG.info("创建selenium-->chrome浏览器驱动");
		WebDriver driver = new ChromeDriver();
		setParam(driver);
		return driver;
	}
	
	/**
	 * 创建selenium-->Firefox浏览器驱动
	 * @return
	 */
	public static WebDriver createFirefoxWebDriver()
	{
		
		LOG.info("创建selenium-->Firefox浏览器驱动");
		WebDriver driver = new FirefoxDriver();
		setParam(driver);
		return driver;
	}
	
	public static void close(WebDriver driver)
	{
		if(null == driver)
		{
			LOG.error("-->This WebDriver is null");
			return;
		}
		driver.close();
	}
	
	/**
	 * 设置驱动参数
	 * @param driver {@link WebDriver}
	 */
	public static void setParam(WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		// 等待1000毫秒中(隐式等待,元素查找时,如果没有找到,则会等待1000毫秒)
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
}
