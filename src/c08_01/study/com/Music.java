package c08_01.study.com;

public class Music {
	public static void tune(Instrucment i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
