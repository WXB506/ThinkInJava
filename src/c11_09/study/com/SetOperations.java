package c11_09.study.com;

import java.util.*;

public class SetOperations {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L M N".split(" "));
		set1.add("M");
		System.out.println(set1.contains("H"));
		System.out.println(set1.contains("N"));
		
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "H I J K L M N".split(" "));
		System.out.println(set1.containsAll(set2));
	}
}
