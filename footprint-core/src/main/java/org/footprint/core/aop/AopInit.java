package org.footprint.core.aop;

import java.text.MessageFormat;
import java.util.Map;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

public class AopInit {

	
	/**
	 * 类的所有方法
	 */
	private static MessageFormat EXP_ALL_METHOD= new MessageFormat("execution(* {0}.*(..))");
	
	/**
	 * 织入切面的order
	 */
	private static int DEFAULT_ASPECT_ORDER= 999;
	
	
	private static String SPRING_BEAN_PREFIX= "_fp_";
	

	public static void init(ApplicationContext context, BeanDefinitionRegistry registry) {
		initWeb(context, registry);
		
//				AspectJExpressionPointcut expression = new AspectJExpressionPointcut();
//				expression.setExpression("execution(* org.footprint.demo.controller.SampleController.*(..))");
//				// new DefaultPointcutAdvisor(expression, new WebAdvice());
//				registry.registerBeanDefinition("webLogAdvisor",
//						getDefinition(DefaultPointcutAdvisor.class, expression, new WebAdvice()));
	}
//
//	public void init(BeanDefinitionRegistry registry) {
//		AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(registry);
//
//		AspectJExpressionPointcut expression = new AspectJExpressionPointcut();
//		expression.setExpression("execution(* org.footprint.demo.controller.SampleController.*(..))");
//		// new DefaultPointcutAdvisor(expression, new WebAdvice());
//		registry.registerBeanDefinition("webLogAdvisor",
//				this.getDefinition(DefaultPointcutAdvisor.class, expression, new WebAdvice()));
//	}

	/**
	 * 初始化web的切面，目前扫描：@Controller，@RestController两个注解
	 * @param context
	 * @param registry
	 */
	private static void initWeb(ApplicationContext context, BeanDefinitionRegistry registry) {
		String[] beanNames= context.getBeanNamesForAnnotation(Controller.class);
		
		
		
		for(String name: beanNames) {
			Class<?> clazz= context.getType(name);;
			AspectJExpressionPointcut expression = new AspectJExpressionPointcut();
			expression.setExpression(getExpression(clazz));
			
			registry.registerBeanDefinition(SPRING_BEAN_PREFIX+ clazz.getSimpleName(),
					getDefinition(DefaultPointcutAdvisor.class, expression, new WebAdvice()));
		}
	}
	

	
	
	public static  String getExpression(Class<?> clazz){
		String name= clazz.getName();
		Object[] array = new Object[]{name};
		String exp = EXP_ALL_METHOD.format(array);
		return exp;
	}

	private static BeanDefinition getDefinition(Class<?> cls, AspectJExpressionPointcut point, WebAdvice advice) {
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(cls);
		bd.getConstructorArgumentValues().addGenericArgumentValue(point);
		bd.getConstructorArgumentValues().addGenericArgumentValue(advice);
		bd.setAttribute("order", DEFAULT_ASPECT_ORDER);

		// bd.getConstructorArgumentValues().addIndexedArgumentValue(0, point);
		// bd.getConstructorArgumentValues().addIndexedArgumentValue(1, advice);

		return bd;
	}
}
