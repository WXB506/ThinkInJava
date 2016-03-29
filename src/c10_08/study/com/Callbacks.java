package c10_08.study.com;

interface Incrementable {
	void increment();
}
class Callee1 implements Incrementable {
	private int i = 0;
	public void increment() {
		i++;
		System.out.println(i);
	}
}
class MyIncrement {
	public void increment() {
		System.out.println("MY.i");
	}
	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class Callee2 extends MyIncrement {
	private int i = 0;
	public void increment() {
		super.increment();
		i++;
		System.out.println("Callee2.i " + i);
	}
	private class Closure implements Incrementable {
		public void increment() {
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}
class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable incrementable) {
		callbackReference = incrementable;
	}
	void g() {
		callbackReference.increment();
	}
}


public class Callbacks {
	public static void main(String[] args) {
		Callee1 callee1 = new Callee1();
		Callee2 callee2 = new Callee2();
		MyIncrement.f(callee2);
		
		Caller caller1 = new Caller(callee1);
		Caller caller2 = new Caller(callee2.getCallbackReference());
		caller1.g();
		caller2.g();
		caller1.g();
		caller2.g();
	}
}
