package c09_08.study.com;

class A {
	// default access
	interface B {
		void f();
	}
	public class BImp implements B {
		public void f() {
			System.out.println("BIMP");
		}
	}
	public class BImp2 implements B {
		public void f() {
			System.out.println("BIMP2");
		}
	}
	// public access
	public interface C {
		void f();
	}
	class CImp implements C {
		public void f() {
			System.out.println("CIMP");
		}
	}
	public class CImp2 implements C {
		public void f() {
			System.out.println("CImp2");
		}
	}
	// private access
	private interface D {
		void f();
	}
	private class DImp implements D {
		public void f() {
			System.out.println("DIMP");
		}
	}
	public class DImp2 implements D {
		public void f() {
			System.out.println("DIMP2");
		}
	}
	
	public D getD() {
		return new DImp2();
	}
	
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	
	// Redundant 'public'
	public interface H {
		void f();
	}
	
	// cannot be private within an interface
	void g();
}

public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {
			System.out.println("Nesting BIMP");
		}
	}
	class CImp implements A.C {
		public void f() {
			System.out.println("Nesting CIMP");
		}
	}
	
	class EImp implements E {
		public void g() {
			System.out.println("EIMP");
		}
	}
	class EGImp implements E.G {
		public void f() {
			System.out.println("EGIMP");
		}
	}
	class EImp2 implements E {
		public void g() {
			System.out.println("EIMP2");
		}
		class EG implements E.G {
			public void f() {
				System.out.println("EG");
			}
		}
	}
	
	
	public static void main(String[] args) {
		A a  = new A();
		a.receiveD(a.getD());
	}
}
