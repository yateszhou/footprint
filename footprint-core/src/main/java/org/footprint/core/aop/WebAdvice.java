package org.footprint.core.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;

public class WebAdvice extends  AbstractLogAdvice{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method= invocation.getMethod();
		
//		String comment= methodCommentMapping.get(method);
		
		
		
		System.out.println(method.getName());
		return null;
	}

	
}
