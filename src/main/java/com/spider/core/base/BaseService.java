package com.spider.core.base;

import javax.annotation.Resource;

/**
 * 抽象service，依赖 BaseDAO
 * @author zhangqiuping
 *
 */
public abstract class BaseService
{
	
	/**
	* 数据持久化公共类
	*/
	@Resource(name = "baseDAO")
	protected BaseDAO baseDAO;
	
}
