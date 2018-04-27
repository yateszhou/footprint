package org.footprint.core;

import org.junit.Test;

public class LoggerFactoryTest {
	
	private void test(){
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
	}
	
	@Test
	public void testGetLogger(){
		test();
		LoggerFactory.getLogger();
	}
}
