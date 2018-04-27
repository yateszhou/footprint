package org.footprint.core.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogger extends AbstractLogger {
	
	private Logger logger;

	public Slf4jLogger(String className, String classComment, String[] groups) {
		super(className, classComment, groups);
		logger= LoggerFactory.getLogger(className);
		
	}

	
	public void error(String msg) {
		logger.error(this.classComment+ msg);
	}
}
