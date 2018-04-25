package org.footprint.core.aop;

import org.aopalliance.intercept.MethodInvocation;

public class WebAdvice implements LogAdvice{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("测试"+11);
		return null;
	}

	
}
