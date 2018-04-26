package org.footprint.core;

public interface Logger {
	
	final String DEFAULT_GROUP= "_FOOTPRINT_GROUP";
	
	
	/**
	 * 设置当前方法打印的日志信息
	 * @param method
	 * @param methodCommont
	 */
	public void setMethodLogInfo(String method, String methodCommont);
}
