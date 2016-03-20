package c05_02.study.com;

// using parameter order distinguish method
public class OverloadingOrder {
	static void f(String s, int i) {
		System.out.println("String : " + s + ", int : " + i);
	}
	
	static void f(int i, String s) {
		System.out.println("int : " + i + ", String : " + s);
	}
	
	public static void main(String[] args) {
		f(11, "Int first");
		f("String first", 90);
	}
}
