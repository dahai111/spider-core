/*
 * 文件名：BasePO.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date 2018年3月22日
 * 上午11:52:39 修改内容：新增
 */
package com.spider.core.base;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;

/**
 * 所有对象的记录对象:包含公共字段
 * 
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 上午11:52:39
 */
public class BasePO implements Serializable
{
	
	private static final long serialVersionUID = -1315962716101477572L;
	
	private String createBy;// 创建人
	
	private Date createDate;// 创建时间
	
	private String updateBy;
	
	private Date updateDate;
	
	public String getCreateBy()
	{
		return createBy;
	}
	
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	public String getUpdateBy()
	{
		return updateBy;
	}
	
	public void setUpdateBy(String updateBy)
	{
		this.updateBy = updateBy;
	}
	
	public Date getCreateDate()
	{
		return createDate;
	}
	
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	public Date getUpdateDate()
	{
		return updateDate;
	}
	
	public void setUpdateDate(Date updateDate)
	{
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString()
	{
		return JSONObject.toJSONString(this);
	}
}
