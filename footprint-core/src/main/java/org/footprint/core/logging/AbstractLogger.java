package org.footprint.core.logging;

import org.footprint.core.Logger;

public abstract class AbstractLogger implements Logger, ThreadLocalChanger{
	protected static String methodCallSign="->";
	
	/**
	 * 分组信息
	 */
	protected String[] groups;
	
	/**
	 * 简单class名称
	 */
	protected String simpleClassName;
	
	/**
	 * 类打印信息
	 */
	protected String classComment;
	
	
	protected ThreadLocal<ThreadLocalLogInfo> threadLocal;
	
	
	
	public AbstractLogger(String className) {
		this.groups = new String[]{AbstractLogger.DEFAULT_GROUP};
		this.simpleClassName= className;
		
		
//		LogUnit[] infos= clazz.getAnnotationsByType(LogUnit.class);
//		if(infos.length> 0) {
//			LogUnit info = infos[0];
//			classComment= info.comment();
//		}
	}
	

	
	public AbstractLogger(String className, String classComment) {
		this.groups = new String[]{AbstractLogger.DEFAULT_GROUP};
		this.simpleClassName= className;
		this.classComment= classComment;
	}
	
	public AbstractLogger(String className, String classComment, String[] groups) {
		if(groups== null || groups.length== 0) {
			this.groups = new String[]{AbstractLogger.DEFAULT_GROUP};
		} else {
			this.groups = groups;
		}
		this.simpleClassName= className;
		this.classComment= classComment;
	}



	@Override
	public void setMethodLogInfo(String method, String methodCommont) {
		
		
	}
	
	
	
}
