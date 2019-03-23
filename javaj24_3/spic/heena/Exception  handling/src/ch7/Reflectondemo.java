package ch7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;

@Documented 
public @interface Reflectondemo {
	String msg();
}
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)