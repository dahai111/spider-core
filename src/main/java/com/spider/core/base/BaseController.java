/*
 * 文件名：BaseController.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月16日 下午4:17:50 修改内容：新增
 */
package com.spider.core.base;

import com.spider.core.result.ResultCode;
import com.spider.core.result.ResultVO;

/**
 * 
 * 
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月16日 下午4:17:50
 */
public abstract class BaseController
{
	
	/**
	 * 返回成功
	 * @return {@link ResultVO}
	 */
	public ResultVO success()
	{
		return success(null);
	}
	
	/**
	 * 返回成功
	 * @return {@link ResultVO}
	 */
	public ResultVO success(Object data)
	{
		return success("成功",data);
	}
	
	/**
	 * 返回成功
	 * @return {@link ResultVO}
	 */
	public ResultVO success(String message,Object data)
	{
		return new ResultVO(ResultCode.SUCCESS,message,data);
	}
	
	/**
	 * 返回失败
	 * @return {@link ResultVO}
	 */
	public ResultVO failed()
	{
		return failed(null);
	}
	
	/**
	 * 返回失败
	 * @return {@link ResultVO}
	 */
	public ResultVO failed(Object data)
	{
		return success("失败",null);
	}
	
	/**
	 * 返回失败
	 * @return {@link ResultVO}
	 */
	public ResultVO failed(String message,Object data)
	{
		return new ResultVO(ResultCode.FAID,message,data);
	}
	
}
