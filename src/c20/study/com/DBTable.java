package c20.study.com;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface DBTable {
	public String name() default "";
}
