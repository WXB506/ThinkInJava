package c11_01.study.com;

import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}
class Orange {
	public void f() {
		System.out.println("Orange");
	}
}


public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		
		for(int i = 0; i < 3; i++)
			apples.add(new Orange());
		
		for(int i = 0; i < apples.size(); i++)
			((Apple)apples.get(i)).id();
	}
}
