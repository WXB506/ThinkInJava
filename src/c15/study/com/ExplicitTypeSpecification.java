package c15.study.com;

import java.util.*;

public class ExplicitTypeSpecification {
	static void f(Map<String, String> ssmap) {
		System.out.println(ssmap.getClass());
	}
	public static void main(String[] args) {
		f(New.<String, String>map());
	}
}
