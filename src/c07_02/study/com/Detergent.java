package c07_02.study.com;
/*
 * Inheritance syntax & properties
 */

class Cleanser {
	private String s = "Cleanser";
	
	public void append(String a) {
		s += a;
	}
	private void dulute() {
		append(" dulute() ");
	}
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dulute();
		System.out.println(x.toString());
	}
}

public class Detergent extends Cleanser {
	// change a method
	public void dulute() {
		System.out.println("change a method");
	}
	
	// add a method
	public void foam() {
		System.out.println("add a method");
	}
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dulute();
		x.foam();
		
		Cleanser c = new Cleanser();
		//c.dulute();
		c.main(args);
	}
}
