package c06_04.study.com;

class Soup1 {
	private Soup1() {
		System.out.println("Soup1()");
	}
	
	// allow creation via static method
	public static Soup1 makeSoup() {
		return new Soup1();
	}
	
	public void f() {
		System.out.println("create via static method.");
	}
}

class Soup2 {
	private Soup2() {
		System.out.println("Soup2()");
	}
	
	// create a static object and return a reference
	private static Soup2 soup2 = new Soup2();
	public static Soup2 access() {
		return soup2;
	}
	
	public void f() {
		System.out.println("create via static object.");
	}
}

// only one public class allowed per file
public class Lunch {
	public static void main(String[] args) {
		//Soup1 soup1 = new Soup1();	// not allowed
		Soup1 soup1 = Soup1.makeSoup(); // allowed
		soup1.f();
		
		//Soup2 soup2 = new Soup2();	// not allowed
		Soup2 soup2 = Soup2.access();	// allowed
		soup2.f();
	}
}
