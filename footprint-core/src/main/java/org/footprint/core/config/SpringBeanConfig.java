package org.footprint.core.config;

import org.footprint.core.utils.ApplicationContextUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;

public class SpringBeanConfig implements BeanDefinitionRegistryPostProcessor{

	public SpringBeanConfig() {
		System.out.print("start");
	}
	
//	@Bean
//	public AConfig getAConfig(){
////		return new AspectConfig.AConfig();
//		return null;
//	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		
		
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
			throws BeansException {
		ApplicationContext ctx= ApplicationContextUtil.getApplicationContext();
//		boolean flag= true;
//		if(flag) {
//			registry.registerBeanDefinition("webLogAspect", this.getDefinition(xx.class));
//		}
	}
	
	
	private BeanDefinition getDefinition(Class<?> cls) {
	    GenericBeanDefinition bd = new GenericBeanDefinition();
	    
	    bd.setBeanClass(cls);
	    
	    return bd;
	 }
	

}
