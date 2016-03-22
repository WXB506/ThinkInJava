package c07_01.study.com;

class Soap {
	private String s;
	
	Soap() {
		s = "Constructed";
		System.out.println("Soap()");
	}
	
	public String toString() {
		return s;
	}
}

public class Bath {
	private String s1 = "Happy";	// initializing at point of definition
	private String s2;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath() {					// initializing at constructor
		s2 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	
	{								// instance initialization
		i = 47;
	}
	
	public String toString() {
		if(s2 == null)				// delayed initialization
			s2 = "Joy";
		
		return
			"s1 = " + s1 + "\n" +
			"s2 = " + s2 + "\n" +
			"i  = " + i  + "\n" +
			"toy = "+ toy+ "\n" +
			"castille = " + castille;
			
	}
	
	public static void main(String[] args) {
		Bath bath = new Bath();
		System.out.println(bath.toString());
	}
}
