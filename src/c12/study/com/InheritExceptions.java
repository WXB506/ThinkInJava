package c12.study.com;

class SimpleException extends Exception {
}

public class InheritExceptions {
	public void f() throws SimpleException {
		System.out.println("Throw SimepleException from f");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritExceptions sed = new InheritExceptions();
		try {
			sed.f();
		} catch(SimpleException e) {
			System.out.println("Caught it !");
		}
	}
}
