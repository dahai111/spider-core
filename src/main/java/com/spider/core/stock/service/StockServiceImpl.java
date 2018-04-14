/*
 * 文件名：StockServiceImpl.java 版权：深圳融信信息咨询有限公司 修改人：zhangqiuping 修改时间：@create_date
 * 2018年3月22日 下午5:07:03 修改内容：新增
 */
package com.spider.core.stock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.eqzh.common.string.StringUtil;
import com.spider.core.base.BaseService;
import com.spider.core.stock.model.StockPO;
import com.spider.core.util.ConllectionUtils;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * 
 * 
 * @author     zhangqiuping
 * @since      2.2.4
 * @create_date 2018年3月22日 下午5:07:03
 */
@Service
public class StockServiceImpl extends BaseService implements StockService
{
	
	/**
	 * 调测日志记录器。
	 */
	private static final Logger LOG = LoggerFactory.getLogger(StockServiceImpl.class);
	
	@Override
	public int save(List<StockPO> stocks)
	{
		if(LOG.isDebugEnabled())
			LOG.debug("导入保存股票列表-->" + (ConllectionUtils.isEmpty(stocks) ? 0 : stocks.size()));
		this.baseDAO.insertBatch(stocks);
		return 0;
	}
	
	@Override
	public List<StockPO> selectAll()
	{
		return baseDAO.selectList();
	}
	
	@Override
	public void deleteStock(String code)
	{
		if(StringUtil.isBlank(code))
			return;
		baseDAO.update(code);
	}
}
