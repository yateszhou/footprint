package org.footprint.core.config;

import org.footprint.core.aop.AopInit;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringInit implements ApplicationContextAware, BeanDefinitionRegistryPostProcessor{
	
	private static ApplicationContext ctx= null;
	
	private static BeanDefinitionRegistry registry= null;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		
		
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry reg)
			throws BeansException {
		registry= reg;
		AopInit.init(ctx, registry);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		ctx= context;
	}
	

	

}
