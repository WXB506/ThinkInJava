package c15.study.com;

import java.util.*;

public class LimitsOfInference {
	static void f(Map<String, List<String>> ssmap) {
		System.out.println(ssmap.getClass().getName());
		System.out.println("String, String");
	}
	public static void main(String[] args) {
		f(New.map());
	}
}
