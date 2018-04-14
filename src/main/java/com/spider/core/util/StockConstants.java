/*
 * 文件名：StockConstants.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月23日 下午1:58:30 修改内容：新增
 */
package com.spider.core.util;

/**
 * 股票信息常量
 * 
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月23日 下午1:58:30
 */
public interface StockConstants
{
	
	public interface Common
	{
		/**符号:-*/
		String DASH = "-";
	}
	
	/**股票的所属交易所*/
	public interface Bourse
	{
		/**深圳证券交易所:SZ*/
		String SZ = "SZ";
		
		/**上海证券交易所:SH*/
		String SH = "SH";
		
		/**未知:WZ*/
		String WZ = "WZ";
	}
	
	/**股票类型,分为A股和B股*/
	public interface Type
	{
		/**表示A股*/
		String A = "A";
		
		/**标识B股*/
		String B = "B";
	}
	
}
