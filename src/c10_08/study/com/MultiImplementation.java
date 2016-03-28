package c10_08.study.com;

class D {
	public void d() {
		System.out.println("D.d");
	}
}
abstract class E {
	abstract void e();
}

class Z extends D {
	public void d() {
		System.out.println("Z.d");
	}
	E makeE() {
		return new E() {
			public void e() {
				System.out.println("Z.e");
			}
		};
	}
}


public class MultiImplementation {
	static void takesD(D d) {
		d.d();
	}
	static void takesE(E e) {
		e.e();
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}
