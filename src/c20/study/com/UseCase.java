package c20.study.com;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface UseCase {
	public int id();
	public String description() default "no description";
}
