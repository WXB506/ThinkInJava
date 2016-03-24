package c07_07.study.com;

/**
 * Inheritance and up-casting
 */
class Instrument {
	public void play() {
		System.out.println("play...");
	}
	static void tune(Instrument i) {
		i.play();
	}
}

/**
 *  Wind object is Instrument
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);
	}

}
