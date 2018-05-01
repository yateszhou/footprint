package org.footprint.core.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;

public class WebAdvice extends  AbstractLogAdvice{

	public WebAdvice(Class<?> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method= invocation.getMethod();
		
//		String comment= methodCommentMapping.get(method);
		
		
		
		System.out.println(method.getName());
		Object rst= invocation.proceed();
		return rst;
	}

	
}
