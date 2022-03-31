package com.pjb.springbootjjwt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jinbin
 * @date 2018-07-08 20:40
 * ElementType.METHOD 注解放置的目标位置可以是方法
 * ElementType.TYPE 表示注解可以用于修饰类、接口、枚举
 * RetentionPolicy.RUNTIME 注解在哪个阶段执行
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
	boolean required() default true;
}
