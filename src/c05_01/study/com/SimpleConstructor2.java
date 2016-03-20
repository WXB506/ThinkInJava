package c05_01.study.com;

// Constructor can have arguments

class Rock2 {
	Rock2(int i) {
		System.out.println(i);
	}
}

public class SimpleConstructor2 {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			new Rock2(i);
		}
	}
}
