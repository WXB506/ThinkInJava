package c08_03.study.com;

class Glyph {
	Glyph() {
		System.out.println("Glyph before draw");
		draw();
		System.out.println("Glyph after draw");
	}
	void draw() {
		System.out.println("Glyph draw");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		System.out.println("roundGlyph.draw(), radius = " + radius);
	}
}
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
