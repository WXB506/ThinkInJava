package c10_07.study.com;

public class TestBed {
	public void f() {
		System.out.println("f()");
	}
	
	public static class Tester {
		public static void main(String[] args) {
			TestBed testBed = new TestBed();
			testBed.f();
		}
	}
}
