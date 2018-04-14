/*
 * 文件名：StockService.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月22日 下午5:06:30 修改内容：新增
 */
package com.spider.core.stock.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.spider.core.exception.SpiderException;
import com.spider.core.result.ResultCode;
import com.spider.core.stock.model.StockPO;
import com.spider.core.util.ConllectionUtils;
import com.spider.core.util.SpiderConstants;
import com.spider.core.util.StockConstants;

/**
 * 股票servcie接口
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 下午5:06:30
 */
public interface StockService
{
	
	public default List<StockPO> toStocks(List<String[]> datas)
	{
		if(ConllectionUtils.isEmpty(datas))
			throw new SpiderException(ResultCode.FAID,"导入股票信息列表是空的-->Is null");
		
		Set<StockPO> stocks = new HashSet<StockPO>();
		for(String[] data:datas)
		{
			String code = data[0].toString();
			StockPO stock = null;
			if(code.startsWith("600") || code.startsWith("601"))
				stock = new StockPO(code,data[1].toString(),StockConstants.Bourse.SH,StockConstants.Type.A);
			else if(code.startsWith("900"))
				stock = new StockPO(code,data[1].toString(),StockConstants.Bourse.SH,StockConstants.Type.B);
			else if(code.startsWith("000") || (code.startsWith("300") || code.startsWith("002")))
				stock = new StockPO(code,data[1].toString(),StockConstants.Bourse.SZ,StockConstants.Type.A);
			else if(code.startsWith("200"))
				stock = new StockPO(code,data[1].toString(),StockConstants.Bourse.SZ,StockConstants.Type.B);
			else stock = new StockPO(code,data[1].toString(),StockConstants.Bourse.WZ,StockConstants.Type.A);
			stock.setCreateBy(SpiderConstants.User.ADMIN);
			stock.setUpdateBy(SpiderConstants.User.ADMIN);
			stocks.add(stock);
		}
		datas = null;
		return Arrays.asList(stocks.toArray(new StockPO[0]));
	}
	
	/**
	 * 保存股票列表
	 * @param stocks  {@link List<StockPO>}
	 * @return 保存的数量
	 */
	public int save(List<StockPO> stocks);
	
	/**
	 * 查询所有股票列表
	 * @return
	 */
	public List<StockPO> selectAll();
	
	/**
	 * 表示终止上市股票(软删除) 
	 * @param code 股票编码
	 */
	public void deleteStock(String code);
	
}
