package org.footprint.core.logging;

import org.footprint.core.Logger;
import org.footprint.core.annotation.LogUnit;

public abstract class AbstractLogger implements Logger{
	protected static String methodCallSign="->";
	
	/**
	 * 分组信息
	 */
	private String group;
	
	/**
	 * 简单class名称
	 */
	private String simpleClassName;
	
	/**
	 * 类打印信息
	 */
	private String classComment;
	
	
	private ThreadLocal<ThreadLocalLogInfo> threadLocal;
	
	
	
	public AbstractLogger(String className) {
		this.group= AbstractLogger.DEFAULT_GROUP;
		this.simpleClassName= className;
		
//		LogUnit[] infos= clazz.getAnnotationsByType(LogUnit.class);
//		if(infos.length> 0) {
//			LogUnit info = infos[0];
//			classComment= info.comment();
//		}
	}



	@Override
	public void setMethodLogInfo(String method, String methodCommont) {
		
		
	}
	
	
}
