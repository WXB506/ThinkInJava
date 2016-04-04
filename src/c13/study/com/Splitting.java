package c13.study.com;

import java.util.Arrays;

public class Splitting {
	public static String Knights = 
			"Then, when you have found the shrubbery, you must";
	public static void split(String regex) {
		System.out.println(Arrays.toString(Knights.split(regex)));
	}
	
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}
}
