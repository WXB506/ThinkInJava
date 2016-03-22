package c07_01.study.com;

/*
 * reusing / SprinklerSystem.java
 * Composition for code reuse.
 */

class WaterSource {
	private String s;
	
	WaterSource() {
		s = "Constructed";
		System.out.println("WaterSource()");
	}
	
	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String s1;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	
	public String toString() {
		return
				"s1     = " + s1 + " \n" +
				"source = " + source + " \n" +
				"i      = " + i + " \n" +
				"f      = " + f;
	}
	
	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem.toString());
	}
}
