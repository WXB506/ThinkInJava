package c20.study.com;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface SQLInteger {
	String namne() default "";
	Constraints constraints() default @Constraints;
}
