package org.footprint.core.logging;

import java.util.HashMap;
import java.util.Map;

import org.footprint.core.Logger;
import org.footprint.core.annotation.LogUnit;

public class LoggerContext {
	private Map<String, Logger> loggerCache= new HashMap<String, Logger>();
	
	public Logger getLogger(String className){
		if(loggerCache.containsKey(className)) {
			return  loggerCache.get(className);
		} else {
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
		
	}
	
	
}
