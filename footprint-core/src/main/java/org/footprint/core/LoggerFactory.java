package org.footprint.core;

import org.footprint.core.annotation.LogUnit;
import org.footprint.core.logging.Slf4jLogger;

public class LoggerFactory {
	
	/**
	 * 加载的时候判断当前日志类型
	 */
	static {
		
	}
	
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
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e1) {
			throw new RuntimeException("无法加载类", e1);
		}
		
		/*
		 * 获取注解的comment和groups
		 */
		LogUnit[] infos= clazz.getAnnotationsByType(LogUnit.class);
		String classComment= null;
		String[] groups = null;
		if(infos.length> 0) {
			/*
			 * 获取comment
			 */
			LogUnit info = infos[0];
			classComment= info.comment();
			if("".equals(classComment) || classComment== null) {
				classComment= info.value();
			}
			
			/*
			 * 获取groups
			 */
			groups= info.group();
		}
		
		Slf4jLogger logger= new Slf4jLogger(className, classComment, groups);
		return logger;
	}
	
	
	public Logger getLogger(Class<?> group, String moduleName){
		return null;
	}
	
	
}
