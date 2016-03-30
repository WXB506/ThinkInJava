package c11_09.study.com;

import java.util.*;

public class SortedSetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for(int i = 0; i < 1000; i++)
			intset.add(rand.nextInt(30));
		System.out.println(intset);
	}
}
