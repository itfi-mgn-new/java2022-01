package lesson6;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface MyAnnotation /*extends java.lang.Annotation*/{
	String value();
	int number() default 100;
	boolean flag() default false;
}
