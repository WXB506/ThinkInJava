package c09_05.study.com;

interface I1 {
	void f();
}
interface I2 {
	int f(int i);
}
interface I3 {
	int f();
}

class C1 {
	public int f() {
		return 1;
	}
}
class C2 implements I1, I2 {
	public void f() {
		System.out.println("void");
	}
	public int f(int i) {
		return 1;
	}
}
class C3 extends C1 implements I2 {
	public int f(int i) {
		return 1;
	}
}
class C4 extends C1 implements I3 {
	public int f() {
		return 0;
	}
}
/*
class C5 extends C1 implements I1 {
	public int f() {
		System.out.println(2);
	}
	public void f() {
		System.out.println("test");
	}
}
*/
public class InterfaceCollision {
	public static void main(String[] args) {
		
	}
}
