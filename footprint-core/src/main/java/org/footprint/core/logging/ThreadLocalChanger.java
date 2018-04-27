package org.footprint.core.logging;

public interface ThreadLocalChanger {

	
	/**
	 * 设置当前方法打印的日志信息
	 * @param method
	 * @param methodCommont
	 */
	public void setMethodLogInfo(String method, String methodCommont);
}
