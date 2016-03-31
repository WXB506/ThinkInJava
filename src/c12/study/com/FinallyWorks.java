package c12.study.com;

class FourException extends Exception {
}

public class FinallyWorks {
	static int count = 0;
	public static void main(String[] args) {
		while(true) {
			try {
				if(count++ == 0)
					throw new FourException();
				System.out.println("No Exception.");
			} catch(FourException e) {
				System.out.println("FourException");
			} finally {
				System.out.println("In finally clause.");
				System.out.println(count);
				if(count == 2)
					break;
			}
		}
	}
}
