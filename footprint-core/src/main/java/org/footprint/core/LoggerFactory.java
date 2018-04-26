package org.footprint.core;

public class LoggerFactory {
	
	/**
	 * 加载的时候判断当前日志类型
	 */
	static {
		
	}
	
	public Logger getLogger(){
		
		
		return null;
	}
	
	public static Logger getLogger(String moduleName){
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
		}
		
		
		return null;
	}
	
	public Logger getLogger(Class<?> group, String moduleName){
		return null;
	}
	
	
}
