package c05_04.study.com;

public class Flower {
	int petalCount = 0;
	String s = "inital value";
	
	public Flower(int petals) {
		petalCount = petals;
	}
	
	public Flower(String s) {
		this.s = s;
	}
	
	public Flower(String s, int petals) {
		this(petals);
		//this(s);	// cannot, must be the first statement
	}
	
	void PrintPetalCount() {
		//this(11); // cannot call constructor in non-constructor
		System.out.println(petalCount);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower(4);
		x.PrintPetalCount();
	}
}
