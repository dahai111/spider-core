/*
 * 文件名：StockPriceBO.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月24日 下午2:05:37 修改内容：新增
 */
package com.spider.core.bo;

import com.spider.core.base.BasePO;
import com.spider.core.util.StockConstants;

/**
 * 股票每日价格业务对象
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月24日 下午2:05:37
 */
public class StockPriceBO extends BasePO
{
	
	private static final long serialVersionUID = -1190544061221088050L;
	
	private String code;// 股票代码
	
	private String name;// 股票名称
	
	private Float price = 0.0f;// 当前价格
	
	private Float range = 0.0f;// 涨幅
	
	private String isRise = "red";// 是否上涨(red:涨 ; green:跌)
	
	private Float start = 0.0f;// 开盘价
	
	private Float max = 0.0f;// 最高价
	
	private Float min = 0.0f;// 最低价
	
	private Float quantityRatio = 0.0f;// 量比
	
	private Float turnoverRatio = 0.0f;// 换手比率%
	
	private Float dealCount = 0.0f;// 交易量:单位(万手)
	
	private Float dealMoney = 0.0f;// 成交额(万)
	
	private Float sj = 0.0f;// 市净率
	
	private Float sy = 0.0f;// 市盈率
	
	private Float capitalization = 0.0f;// 总市值
	
	private Float circulateCapitalization = 0.0f;// 流通市值
	
	private Float superIn = 0.0f;// 超大单:流入
	
	private Float superOut = 0.0f;// 超大单:流出
	
	private Float largeIn = 0.0f;// 大单:流入
	
	private Float largeOut = 0.0f;// 大单:流出
	
	private Float mediumIn = 0.0f;// 中单:流入
	
	private Float mediumOut = 0.0f;// 中单:流出
	
	private Float smallIn = 0.0f;// 小单:流入
	
	private Float smallOut = 0.0f;// 小单:流出
	
	private String dateString;
	
	public StockPriceBO()
	{
		super();
	}
	
	/**
	 * 
	 * 构造函数。
	 * 
	 * @param price 当前价格
	 * @param start 开盘价
	 * @param max 最高价
	 * @param min 最低价
	 * @param quantityRatio  量比
	 * @param turnoverRatio 换手比率%
	 * @param dealCount 交易量:单位(万手)
	 * @param dealMoney 成交额(万)
	 * @param sj 市净率
	 * @param sy 市盈率
	 * @param capitalization 总市值
	 * @param circulateCapitalization  流通市值
	 */
	public StockPriceBO(String range,String isRise,String code,String name,String price,String start,String max,String min,String quantityRatio,String turnoverRatio,String dealCount,String dealMoney,
	        String sj,String sy,String capitalization,String circulateCapitalization,String superIn,String superOut,String largeIn,String largeOut,String mediumIn,String mediumOut,String smallIn,
	        String smallOut)
	{
		super();
		this.code = code;
		this.name = name;
		if(!"停牌".equals(price) && !"终止上市".equals(price))
		{
			this.range = Float.valueOf(range.replace("%",""));
			this.isRise = isRise;
			this.price = Float.valueOf(price);
			this.start = Float.valueOf(start);
			this.max = Float.valueOf(max);
			this.min = Float.valueOf(min);
			this.quantityRatio = Float.valueOf(quantityRatio.replace("%",""));
			this.turnoverRatio = Float.valueOf(turnoverRatio.replace("%",""));
			this.dealCount = parseDealCount(dealCount);
			this.dealMoney = parseDealMonye(dealMoney);
			this.sj = (sj.equals("-") ? 0.0f : Float.valueOf(sj));
			this.sy = (sy.equals("-") ? 0.0f : Float.valueOf(sy));
			this.capitalization = parseCapitalization(capitalization);
			this.circulateCapitalization = parseCapitalization(circulateCapitalization);
			this.superIn = Float.valueOf(superIn);
			this.superOut = Float.valueOf(superOut);
			this.largeIn = Float.valueOf(largeIn);
			this.largeOut = Float.valueOf(largeOut);
			this.mediumIn = Float.valueOf(mediumIn);
			this.mediumOut = Float.valueOf(mediumOut);
			this.smallIn = Float.valueOf(smallIn);
			this.smallOut = Float.valueOf(smallOut);
		}
		
	}
	
	public String getDateString()
	{
		return dateString;
	}
	
	public void setDateString(String dateString)
	{
		this.dateString = dateString;
	}
	
	public Float getSuperIn()
	{
		return superIn;
	}
	
	public void setSuperIn(Float superIn)
	{
		this.superIn = superIn;
	}
	
	public Float getSuperOut()
	{
		return superOut;
	}
	
	public void setSuperOut(Float superOut)
	{
		this.superOut = superOut;
	}
	
	public Float getLargeIn()
	{
		return largeIn;
	}
	
	public void setLargeIn(Float largeIn)
	{
		this.largeIn = largeIn;
	}
	
	public Float getLargeOut()
	{
		return largeOut;
	}
	
	public void setLargeOut(Float largeOut)
	{
		this.largeOut = largeOut;
	}
	
	public Float getMediumIn()
	{
		return mediumIn;
	}
	
	public void setMediumIn(Float mediumIn)
	{
		this.mediumIn = mediumIn;
	}
	
	public Float getMediumOut()
	{
		return mediumOut;
	}
	
	public void setMediumOut(Float mediumOut)
	{
		this.mediumOut = mediumOut;
	}
	
	public Float getSmallIn()
	{
		return smallIn;
	}
	
	public void setSmallIn(Float smallIn)
	{
		this.smallIn = smallIn;
	}
	
	public Float getSmallOut()
	{
		return smallOut;
	}
	
	public void setSmallOut(Float smallOut)
	{
		this.smallOut = smallOut;
	}
	
	public Float getRange()
	{
		return range;
	}
	
	public void setRange(Float range)
	{
		this.range = range;
	}
	
	public String getIsRise()
	{
		return isRise;
	}
	
	public void setIsRise(String isRise)
	{
		this.isRise = isRise;
	}
	
	private Float parseCapitalization(String capitalization)
	{
		if(StockConstants.Common.DASH.equals(capitalization))
			return 0.0f;
		
		if(capitalization.endsWith("万亿"))
			return Float.valueOf(capitalization.replace("万亿","")) * 10;
		
		if(capitalization.endsWith("亿"))
			return Float.valueOf(capitalization.replace("亿",""));
		return 0.0f;
	}
	
	private Float parseDealMonye(String dealMoney)
	{
		if(StockConstants.Common.DASH.equals(dealMoney))
			return 0.0f;
		
		if(dealMoney.endsWith("亿"))
			return Float.valueOf(dealMoney.replace("亿","")) * 10;
		
		if(dealMoney.endsWith("万"))
			return Float.valueOf(dealMoney.replace("万",""));
		return 0.0f;
	}
	
	private Float parseDealCount(String dealCount)
	{
		if(StockConstants.Common.DASH.equals(dealMoney))
			return 0.0f;
		
		if(dealCount.endsWith("万手"))
			return Float.valueOf(dealCount.replace("万手",""));
		
		if(dealCount.endsWith("手"))
			return Float.valueOf(dealCount.replace("手","")) / 10000;
		
		return 0.0f;
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
	
	public Float getDealMoney()
	{
		return dealMoney;
	}
	
	public void setDealMoney(Float dealMoney)
	{
		this.dealMoney = dealMoney;
	}
	
	public Float getSj()
	{
		return sj;
	}
	
	public void setSj(Float sj)
	{
		this.sj = sj;
	}
	
	public Float getSy()
	{
		return sy;
	}
	
	public void setSy(Float sy)
	{
		this.sy = sy;
	}
	
	public Float getCapitalization()
	{
		return capitalization;
	}
	
	public void setCapitalization(Float capitalization)
	{
		this.capitalization = capitalization;
	}
	
	public Float getCirculateCapitalization()
	{
		return circulateCapitalization;
	}
	
	public void setCirculateCapitalization(Float circulateCapitalization)
	{
		this.circulateCapitalization = circulateCapitalization;
	}
	
	public Float getPrice()
	{
		return price;
	}
	
	public void setPrice(Float price)
	{
		this.price = price;
	}
	
	public Float getStart()
	{
		return start;
	}
	
	public void setStart(Float start)
	{
		this.start = start;
	}
	
	public Float getMax()
	{
		return max;
	}
	
	public void setMax(Float max)
	{
		this.max = max;
	}
	
	public Float getMin()
	{
		return min;
	}
	
	public void setMin(Float min)
	{
		this.min = min;
	}
	
	public Float getQuantityRatio()
	{
		return quantityRatio;
	}
	
	public void setQuantityRatio(Float quantityRatio)
	{
		this.quantityRatio = quantityRatio;
	}
	
	public Float getTurnoverRatio()
	{
		return turnoverRatio;
	}
	
	public void setTurnoverRatio(Float turnoverRatio)
	{
		this.turnoverRatio = turnoverRatio;
	}
	
	public Float getDealCount()
	{
		return dealCount;
	}
	
	public void setDealCount(Float dealCount)
	{
		this.dealCount = dealCount;
	}
	
}
