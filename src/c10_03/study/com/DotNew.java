package c10_03.study.com;

public class DotNew {
	public class Inner {
		public void f() {
			System.out.println("Inner.f()");
		}
	}
	public static void main(String[] args) {
		DotNew dotNew = new DotNew();
		DotNew.Inner dInner = dotNew.new Inner();
		dInner.f();
	}
}
