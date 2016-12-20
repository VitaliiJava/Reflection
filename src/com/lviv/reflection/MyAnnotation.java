package com.lviv.reflection;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value ={ElementType.TYPE, ElementType.FIELD,
				ElementType.METHOD, ElementType.CONSTRUCTOR,
				ElementType.PACKAGE})
public @interface MyAnnotation {
	String name() default "unknow";
	String type() default "unknow";
	int id() default 1;
}
