package org.footprint.core;

import org.footprint.core.logging.LoggerContext;



public class LoggerFactory {
	
	
	/**
	 * 获取logger，该方法会通过java执行上下文得到调用类的类型，
	 * 然后执行相关操作，性能比较低，用于创建logger用，如果是获取
	 * 已经创建好的logger，请使用getLogger(Class<?>)或者getLogger(String)方法
	 * @return
	 */
	public static Logger getLogger(){
		String className= "";
		StackTraceElement[] array= (new Throwable()).getStackTrace();
		StackTraceElement e= null;
		if(array!= null && array.length!= 0) {
			if( array.length== 1) {
				e= array[0];
			} else {
				e= array[1];
			}
			className= e.getClassName();
			e.getClass();
		}
		return getContext().getLogger(className);
	}
	
	public static Logger getLogger(Class<?> clazz){
		return getContext().getLogger(clazz.getName());
	}
	
	public static Logger getLogger(String clazzName){
		return getContext().getLogger(clazzName);
	}
	
	
	
	private static LoggerContext getContext(){
		return context;
	}
	
	private static LoggerContext context= new LoggerContext();
}
