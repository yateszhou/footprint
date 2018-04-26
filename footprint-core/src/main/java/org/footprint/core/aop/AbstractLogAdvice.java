package org.footprint.core.aop;

import java.lang.reflect.Method;
import java.util.Map;

import org.footprint.core.Logger;

public abstract class AbstractLogAdvice implements LogAdvice{
	protected Logger logger;
	
	/**
	 * 目标class
	 */
	private Class<?> targetClass;
	
	/**
	 * 缓存当前类的所有方法上的备注
	 */
	protected Map<Method, String> methodCommentMapping;
	
	
}
