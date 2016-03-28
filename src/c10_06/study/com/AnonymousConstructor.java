package c10_06.study.com;

abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			public void f() {
				System.out.println("In annoymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
