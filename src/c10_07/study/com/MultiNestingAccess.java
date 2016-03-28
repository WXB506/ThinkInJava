package c10_07.study.com;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

class MNA {
	private void f() {
		System.out.println("f");
	}
	class A {
		private void g() {
			System.out.println("G");
		}
		public class B {
			void h() {
				f();
				g();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}
