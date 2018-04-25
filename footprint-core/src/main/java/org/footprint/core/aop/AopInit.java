package org.footprint.core.aop;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class AopInit {
	public void init(BeanDefinitionRegistry registry){
		
		AspectJExpressionPointcut expression = new AspectJExpressionPointcut();
        expression.setExpression("execution(* org.footprint.demo.controller.SampleController.*(..))");
//        new DefaultPointcutAdvisor(expression, new WebAdvice());
		registry.registerBeanDefinition("webLogAdvisor", this.getDefinition(DefaultPointcutAdvisor.class, expression, new WebAdvice()));
	}
	
	private BeanDefinition getDefinition(Class<?> cls, AspectJExpressionPointcut point, WebAdvice advice) {
	    GenericBeanDefinition bd = new GenericBeanDefinition();
	    bd.setBeanClass(cls);
	    
	    bd.getConstructorArgumentValues().addGenericArgumentValue(point);
	    bd.getConstructorArgumentValues().addGenericArgumentValue(advice);
	    
//	    bd.getConstructorArgumentValues().addIndexedArgumentValue(0, point);
//	    bd.getConstructorArgumentValues().addIndexedArgumentValue(1, advice);
	    
	    return bd;
	 }
}
