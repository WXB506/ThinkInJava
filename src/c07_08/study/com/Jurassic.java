package c07_08.study.com;

class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 8;
	SmallBrain x = new SmallBrain();
	
	void f() {
		System.out.println("Dinosaur cannot be extend.");
	}
}

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
