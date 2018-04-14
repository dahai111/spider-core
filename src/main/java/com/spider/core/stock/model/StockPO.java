/*
 * 文件名：StockPO.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月22日 下午5:30:55 修改内容：新增
 */
package com.spider.core.stock.model;

import org.apache.commons.lang3.StringUtils;

import com.spider.core.base.BasePO;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * 
 * 
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 下午5:30:55
 */
public class StockPO extends BasePO
{
	
	private static final long serialVersionUID = 1276336452899268253L;
	
	private Long id;// 数据库序列自定id
	
	private String code;// 股票编码
	
	private String name;// 股票名称
	
	private String bourse;// 归属的交易所:(SH:上海; SZ:深圳)
	
	private String type;// 股票类型,分为A股和B股
	
	public StockPO()
	{
		super();
	}
	
	public StockPO(String code,String name,String bourse,String type)
	{
		super();
		this.code = code;
		this.name = name;
		this.bourse = bourse;
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getBourse()
	{
		return bourse;
	}
	
	public void setBourse(String bourse)
	{
		this.bourse = bourse;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(null == obj)
			return false;
		
		if(!(obj instanceof StockPO))
			return false;
		
		StockPO stock = (StockPO)obj;
		if(StringUtils.isBlank(stock.getCode()) || StringUtils.isBlank(this.code))
			return false;
		
		if(!this.code.equals(stock.getCode()))
			return false;
		
		return true;
	}
}
