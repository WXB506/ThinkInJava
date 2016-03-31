package c12.study.com;

class FiveException extends Exception {
}

public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("Entering first try block");
		try {
			System.out.println("Entering second try block");
			try {
				throw new FiveException();
			} finally {
				System.out.println("finally in 2nd try block");
			}
		} catch(FiveException e) {
			System.out.println("Caught FiveException in 1st try block");
		} finally {
			System.out.println("finally in 1st try block");
		}
	}
}
