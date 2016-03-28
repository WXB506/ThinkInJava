package c10_03.study.com;

public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] arsg) {
		DotThis dotThis = new DotThis();
		DotThis.Inner doInner = dotThis.inner();
		doInner.outer().f();
	}
}
