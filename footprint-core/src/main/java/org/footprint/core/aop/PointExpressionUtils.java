package org.footprint.core.aop;

import java.text.MessageFormat;

public class PointExpressionUtils {

	/**
	 * 类的所有方法
	 */
	private static String EXP_ALL_METHOD= "execution( * {0}.*(..) )";
	
	/**
	 *  类的所有公共方法
	 */
	private static String EXP_ALL_PUBLIC_METHOD= "execution( public {0}.*(..) )";
	
	/**
	 *  类的非私有方法
	 */
	private static String EXP_EXCEPT_PRIVATE_METHOD= EXP_ALL_PUBLIC_METHOD+ "execution(! private {0}.*(..) )";
	
	public static  String getExpression(Class<?> clazz){
		String name= clazz.getName();
		String exp = MessageFormat.format(EXP_ALL_METHOD, name);
		return exp;
	}
}
