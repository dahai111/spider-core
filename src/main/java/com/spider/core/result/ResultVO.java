/*
 * 文件名：ResultVO.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月22日 上午11:49:53 修改内容：新增
 */
package com.spider.core.result;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回结果对象
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 上午11:49:53
 */
public class ResultVO
{
	private String code;// 响应码
	
	private String message;// code字段对应的提示信息
	
	private Object data;// 响应数据对象
	
	private Object exstendAttribute;// 扩展字段
	
	public ResultVO()
	{}
	
	public ResultVO(String code,String message)
	{
		this.code = code;
		this.message = message;
	}
	
	public ResultVO(String code,String message,Object data)
	{
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public ResultVO(String code,String message,Object data,Object exstendAttribute)
	{
		this.code = code;
		this.message = message;
		this.data = data;
		this.exstendAttribute = exstendAttribute;
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
	
	public Object getData()
	{
		return data;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public Object getExstendAttribute()
	{
		return exstendAttribute;
	}
	
	public void setExstendAttribute(Object exstendAttribute)
	{
		this.exstendAttribute = exstendAttribute;
	}
	
	@Override
	public String toString()
	{
		return JSONObject.toJSONString(this);
	}
	
}
