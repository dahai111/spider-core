package com.spider.core.util;

import java.util.List;
import java.util.Map;

/**
 * 集合工具类，判断map，list等集合是否为空
 * @author zhangqiuping
 *
 */
public class ConllectionUtils {
	
	/**
	 *	验证集合是否为空
	 * @param list {@link List<?>}
	 * @return boolean true表示空的，false表示不是空的
	 */
	public static boolean isEmpty(List<?> list){
		if(null == list || list.isEmpty()){
			return true;
		}
		return false;
	}
	
	/**
	 * 验证map数据类型是否是空的 
	 * @param map {@link Map<?,?>}
	 * @return boolean true表示空，false表示不为空
	 */
	public static boolean isEmpty(Map<?,?> map){
		if(map == null || map.isEmpty()){
			return true;
		}
		return false;
	}

}
