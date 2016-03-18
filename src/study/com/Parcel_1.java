package study.com;

public class Parcel_1 {
	
	// inner class one
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	// inner class two
	class Destination {
		private String label;
		
		Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	// using inner class
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel_1 p = new Parcel_1();
		p.ship("Tasmania");
	}
	
}
