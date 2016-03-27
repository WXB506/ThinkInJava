package c09_01.study.com;

interface Instrument {
	int VALUE = 5;			// static and final

	void play(String s);	// cannot have method definition, automatically public
	void adjust();
}

class Wind1 implements Instrument {
	public void play(String s) {
		System.out.println("Wind " + s);
	}
	public void adjust() {
		System.out.println("Wind");
	}
}

class Brass1 extends Wind1 {
	public String toString() {
		return "Brass1";
	}
}
public class Music5 {
	public static void main(String[] args) {
		Brass1 brass1 = new Brass1();
		brass1.play(brass1.toString());
		brass1.adjust();
	}
}
