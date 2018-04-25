package org.footprint.core.aop;

import java.lang.reflect.Method;
import java.util.Map;

import org.footprint.core.Logger;

public abstract class AbstractLogAdvice implements LogAdvice{
	private Logger logger;
	
	/**
	 * 目标class
	 */
	private Class<?> targetClass;
	
	private Map<Method, String> methodPrefix;
}
