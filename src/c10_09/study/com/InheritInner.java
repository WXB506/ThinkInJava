package c10_09.study.com;

class WithInner {
	class Inner {
		public void f() {
			System.out.println("Inner.f");
		}
	}
}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
		ii.f();
	}
}
