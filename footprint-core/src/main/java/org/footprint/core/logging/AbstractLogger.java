package org.footprint.core.logging;

import org.footprint.core.Logger;

public abstract class AbstractLogger implements Logger{
	protected static String methodCallSign="->";
	
	/**
	 * 简单class名称
	 */
	private String simpleClassName;
	
	/**
	 * 类打印信息
	 */
	private String classPrint;
	
	
	private ThreadLocal<String> methodName;
	
	private ThreadLocal<String> methodPrint;

	@Override
	public void setMethodLogInfo(String method, String methodCommont) {
		
		
	}
	
	
}
