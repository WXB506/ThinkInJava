package c08_01.study.com;

class Instrucment {
	public void play(Note n) {
		System.out.println("Instrucment play");
	}
}

public class Wind extends Instrucment {
	public void play(Note n) {
		System.out.println("Wind paly");
	}
}
