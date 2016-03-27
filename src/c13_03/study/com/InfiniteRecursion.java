package c13_03.study.com;

import java.util.*;

public class InfiniteRecursion {
	public String toString() {
		return " InfiniteRecursion addrress: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		
		for(int i=0; i<10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}
