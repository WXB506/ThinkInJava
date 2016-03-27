package c09_01.study.com;

abstract class Instrucment {
	private int i;
	
	public String what() {
		return "Instrucment";
	}
	
	public abstract void play(String s);
	public abstract void adjust();
}

class Wind extends Instrucment {
	public String what() {
		return "Wind";
	}
	public void play(String s) {
		System.out.println(s);
	}
	public void adjust() {
		System.out.println("Wind adjust");
	}
}

class Brass extends Wind {
	public String what() {
		return "Brass";
	}
}

public class Music4 {
	public static void main(String[] args) {
		Brass brass = new Brass();
		brass.what();
		brass.play("test");
		brass.adjust();
	}
}
