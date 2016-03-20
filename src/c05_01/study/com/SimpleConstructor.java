package c05_01.study.com;

// Demonstration of a simple constructor

class Rock {
	Rock() {
		System.out.println("Rock");
	}
}

public class SimpleConstructor {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			// create object, not reference
			new Rock();
		}
	}
}
