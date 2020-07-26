package com.mdjin.part20;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 用例注解
 * @author jinma
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface UseCase {

	public int id();
	
	public String description() default "no description";
	
}
