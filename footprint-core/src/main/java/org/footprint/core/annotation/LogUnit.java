package org.footprint.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.footprint.core.Logger;
import org.springframework.core.annotation.AliasFor;

/**
 * 当前方法所有所有日志打印的前缀，该信息放在threadlocal里面，会有性能损耗
 * @author yates zhou
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogUnit {
	/**
	 * 备注
	 */
	String comment() default "";
	
	String[] group() default {Logger.DEFAULT_GROUP};

	@AliasFor("comment")
	String value();


}
