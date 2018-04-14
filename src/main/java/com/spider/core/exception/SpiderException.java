package com.spider.core.exception;

/**
 * 自定义采集数据相依异常类
 * @author zhangqiuping
 *
 */
public class SpiderException extends RuntimeException
{
	
	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = -3870657552982046748L;
	
	private String code;// 异常响应编码
	
	private String message;// 异常响应消息
	
	public SpiderException()
	{
		super();
	}
	
	public SpiderException(String code)
	{
		this.code = code;
	}
	
	public SpiderException(String code,String message)
	{
		super(message);
		this.code = code;
		this.message = message;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
}
