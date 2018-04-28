package org.footprint.core.aop;

import java.text.MessageFormat;

public class PointExpressionUtils {

	/**
	 * 类的所有方法
	 */
	private static String EXP_ALL_METHOD= "execution( * {0}.*(..) )";
	
	
	public static  String getExpression(Class<?> clazz){
		String name= clazz.getName();
		String exp = MessageFormat.format(EXP_ALL_METHOD, name);
		return exp;
	}
}
