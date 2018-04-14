/*
 * 文件名：HtmlUnitClient.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月22日 上午11:34:47 修改内容：新增
 */
package com.spider.core.htmlunit;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * 
 * Htmlunit解析网页单例工具
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 上午11:34:47
 */
public class HtmlUnitClient
{
	
	private static final WebClient HTMLUNIT_CHROME = new WebClient(BrowserVersion.CHROME);
	
	private static final WebClient HTMLUNIT_FIREFOX = new WebClient(BrowserVersion.FIREFOX_52);
	
	private HtmlUnitClient()
	{}
	
	public static WebClient getChrome(Boolean javaScriptEnabled,Boolean cssEnabled,Boolean useInsecureSSL)
	{
		HTMLUNIT_CHROME.getOptions().setJavaScriptEnabled(false);
		HTMLUNIT_CHROME.getOptions().setCssEnabled(false);
		HTMLUNIT_CHROME.getOptions().setUseInsecureSSL(false);
		HTMLUNIT_CHROME.getOptions().setThrowExceptionOnScriptError(false);// js运行错误时不抛出异常
		HTMLUNIT_CHROME.getOptions().setTimeout(100000);// 设置连接超时时间
		HTMLUNIT_CHROME.getOptions().setDoNotTrackEnabled(false);
		return HTMLUNIT_CHROME;
	}
	
	public static WebClient getFirefox(Boolean javaScriptEnabled,Boolean cssEnabled,Boolean useInsecureSSL)
	{
		HTMLUNIT_FIREFOX.getOptions().setJavaScriptEnabled(javaScriptEnabled);
		HTMLUNIT_FIREFOX.getOptions().setCssEnabled(cssEnabled);
		HTMLUNIT_FIREFOX.getOptions().setUseInsecureSSL(useInsecureSSL);
		return HTMLUNIT_FIREFOX;
	}
}
