package c10_08.study.com;

interface A {
	void a();
}
interface B {
	void b();
}

class X implements A, B {
	public void a() {
		System.out.println("X.A");
	}
	public void b() {
		System.out.println("X.B");
	}
}

class Y implements A {
	public void a() {
		System.out.println("Y.A");
	}
	B makeB() {
		return new B() {
			public void b() {
				System.out.println("Y.B");
			}
		};
	}
}

public class MultiInterfaces {
	static void takesA(A a) {
		a.a();
	}
	static void takesB(B b) {
		b.b();
	}
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}
}
