package cn.day11.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})//表示只能作用于类上
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnoDemo03 {

}
