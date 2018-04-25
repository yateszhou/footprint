package org.footprint.core.logging;

public abstract class AbstractLogger {
	/**
	 * 简单class名称
	 */
	private String simpleClassName;
	
	/**
	 * 类打印信息
	 */
	private String classPrint;
	
	
	private ThreadLocal<String> methodLocal;
	
	
}
