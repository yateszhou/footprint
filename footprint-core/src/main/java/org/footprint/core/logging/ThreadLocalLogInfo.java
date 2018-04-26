package org.footprint.core.logging;

/**
 * 放在threadLocal里面的相关日志变量信息。
 * 从threadLocal上面那信息会慢，所以把需要的信息放在一起，值需要拿一次，而不是有多个
 * threadLocal变量，每次都去获取。
 * @author DELL
 *
 */
public class ThreadLocalLogInfo {
	/**
	 * 方法名称
	 */
	String methodName;
	
	
	/**
	 * 对方法的备注
	 */
	String methodCommont;
	
	/**
	 * 用户拼接日志的StringBuilder
	 */
	StringBuilder sb = null;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodCommont() {
		return methodCommont;
	}

	public void setMethodCommont(String methodCommont) {
		this.methodCommont = methodCommont;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}
	
	
}
